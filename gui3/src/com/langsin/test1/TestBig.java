package com.langsin.test1;

import java.math.BigDecimal;

public class TestBig {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("12987398172398172398172398172398173981273981723981273981723981723234234234");
		BigDecimal b2 = new BigDecimal("27349287349827349827349827394872394827394827389444444444449823872498243298234234");
		System.out.println(b1.divide(b2));
	}
}
