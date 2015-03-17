package com.langsin.collection.testMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public static void showMap(Map map){
		Set keys = map.keySet();	//将map中所有的key取出来 放到一个set容器中
		Iterator iter = keys.iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			Object value = map.get(key);
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("0531", "济南");
		map.put("0531", "北京");
		map.put("0532", "青岛");
		map.put("0633", "日照");
		
		
		showMap(map);
	}

}
