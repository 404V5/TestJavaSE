package com.langsin.collection.TestList;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * ԭ����һ������   is
		 * �����ʼ��������Ԫ��   0  1  2
		 * �������ĳ��Ⱦ���3
		 * ���������������
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
