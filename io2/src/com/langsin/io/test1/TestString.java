package com.langsin.io.test1;

public class TestString {

	public static void main(String[] args) {
		String s = "жпнд";
		byte[] bs = s.getBytes();
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}

		byte[] bs2 = { -42, -48, -50, -60 };
		String s2 = new String(bs2,0,2);
		System.out.println(s2);

	}
}
