package com.langsin.thread.testjuc.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public class LsCache {

	public static ConcurrentHashMap<Integer, Future<Integer>> map = new ConcurrentHashMap<Integer,  Future<Integer>>();
	
	public static void addCache(Integer key, Future<Integer> value){
		map.putIfAbsent(key, value);
	}
	
	public static Future<Integer> popCache(Integer key){
		return map.get(key);
	}
	
	public static boolean hasKey(Integer key){
		return map.containsKey(key);
	}
	
	public static void removeValue(Integer key){
		map.remove(key);
	}
}
