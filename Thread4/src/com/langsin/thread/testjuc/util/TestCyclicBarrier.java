package com.langsin.thread.testjuc.util;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {
	int[][] rect = {{1,2,3},{4,5,6},{7,8,9}};
	int[] rowResult = new int[rect.length];
	Calc calc = new Calc();
	public static void main(String[] args) {
		TestCyclicBarrier test = new TestCyclicBarrier();
		test.go();
	}
	private void go() {
		CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
			public void run() {
				System.out.println("所有计算线程执行完毕，这里开始汇总");
				int total = calc.add(rowResult);
				System.out.println(total);
			}
		});
		for(int i = 0;i<rect.length;i++){
			final int row = i;
			new RowThread(barrier, row).start();
		}
	}
	class RowThread extends Thread{
		Random r = new Random();
		CyclicBarrier barrier;// 计数器
		int row;
		public RowThread(CyclicBarrier barrier, int row) {
			this.barrier = barrier;
			this.row = row;
		}
		@Override
		public void run() {
			rowResult[row] = calc.add(rect[row]);
			try {
				Thread.sleep(r.nextInt(4000));
				System.out.println(Thread.currentThread().getName()+"计算完毕，开始等待");
				barrier.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
		}
	}
	class Calc{
		public int add(int[] row){
			int total = 0;
			for (int i : row) {
				total+=i;
			}
			return total;
		}
	}
}
