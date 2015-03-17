package com.langsin.test1;
import static com.langsin.test1.Country.*;
import static java.util.Calendar.*;
import java.util.Calendar;

/**
 * 测试静态导入
 * 就是将一个类的静态成员     使用导包的形式
 * 导入到一个类中。
 * @author Administrator
 *
 */
public class TestStaticImport {

	public static void main(String[] args) {
		/**
		 * 为什么不能new 
		 * 遇到一个类不能直接new 
		 * 它的构造方法是private类型。
		 */
		Calendar c = Calendar.getInstance();
		
		int day = c.get(DAY_OF_YEAR);
		int day2 = c.get(DAY_OF_WEEK);
		System.out.println(day2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
