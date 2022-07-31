package com.hashtable;

import java.util.HashMap;
import java.util.LinkedList;
public class HashMapEasy {
	public static void main(String [] args ) {
		HashMap map= new HashMap();
		LinkedList<String> list = new LinkedList<String>();
		list.add("amit");
		list.add("omi");
		list.add("ravi");
		map.put(1,list);
		System.out.println(" "+map);
		
	}

}
