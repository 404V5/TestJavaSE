package com.langsin.test1;
import static com.langsin.test1.Country.*;
import static java.util.Calendar.*;
import java.util.Calendar;

/**
 * ���Ծ�̬����
 * ���ǽ�һ����ľ�̬��Ա     ʹ�õ�������ʽ
 * ���뵽һ�����С�
 * @author Administrator
 *
 */
public class TestStaticImport {

	public static void main(String[] args) {
		/**
		 * Ϊʲô����new 
		 * ����һ���಻��ֱ��new 
		 * ���Ĺ��췽����private���͡�
		 */
		Calendar c = Calendar.getInstance();
		
		int day = c.get(DAY_OF_YEAR);
		int day2 = c.get(DAY_OF_WEEK);
		System.out.println(day2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
