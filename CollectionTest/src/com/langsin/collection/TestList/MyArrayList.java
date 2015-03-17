package com.langsin.collection.TestList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List{
	
	private int size = 10;
	private int current = 0;
	Object[] obj = new Object[size];
	
	
	
	/**
	 * 用来确定数组的容量是否到达极限
	 * 这里涉及到一个问题：
	 * 如何将数组扩容？
	 * 
	 * 
	 * 
	 * @param minCapacity
	 */
	private void ensureCapacity(int minCapacity){
		if(minCapacity >  size){
			//数组就装不下了  需要扩充数组
			/**
			 * 新建一个长度为当前数组两倍的数组
			 * 将原来的数组中的内容拷贝到新的数组
			 * 将全局变量的数组引用指向新定义的数组
			 */
//			
//			Object[] newObj = new Object[size*2];
//			for(int i = 0 ;i<obj.length;i++){
//				newObj[i] = obj[i];
//			}
//			
//			obj = newObj;
//			size = size*2;
			
//			System.arraycopy(src, srcPos, dest, destPos, length)
			
			
		obj = Arrays.copyOf(obj, size*2);
		size = size*2;
			
		}else{
			
		}
	} 

	
	@Override
	public boolean add(Object e) {
		ensureCapacity(current+1);
		obj[current++]= e;
		return false;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return obj[index];
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
