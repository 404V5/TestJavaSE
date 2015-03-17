package com.langsin.collection.TestList;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * 原来有一个数组   is
		 * 里面初始化了三个元素   0  1  2
		 * 这个数组的长度就是3
		 * 现在想把数组扩大
		 * 
		 */
		int[] is = new int[3];
		for (int i = 0; i < is.length; i++) {
			is[i] = i;
		}
		
		int[] newIs = Arrays.copyOf(is, 6);
		for (int i = 0; i < newIs.length; i++) {
			System.out.println(newIs[i]);
		}
	}
}
