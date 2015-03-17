package com.langsin.collection.testMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public static void showMap(Map map){
		Set keys = map.keySet();	//��map�����е�keyȡ���� �ŵ�һ��set������
		Iterator iter = keys.iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			Object value = map.get(key);
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("0531", "����");
		map.put("0531", "����");
		map.put("0532", "�ൺ");
		map.put("0633", "����");
		
		
		showMap(map);
	}

}
