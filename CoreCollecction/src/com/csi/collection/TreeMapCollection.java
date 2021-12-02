package com.csi.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {
	public static void main(String[] args) {
		
		TreeMap<String, String> tm= new TreeMap<>();
		tm.put("Id", "1121");
		tm.put("Name", "Amit");
		tm.put("Brand", "lenovo");
		//tm.put(null, "bhai");
		
		for(Map.Entry<String, String> m: tm.entrySet()){
			System.out.println(m.getKey()+" :"+m.getValue());
		}
	}

}
