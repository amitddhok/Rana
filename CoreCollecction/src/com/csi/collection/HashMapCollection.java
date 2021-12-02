package com.csi.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
	public static void main(String[] args) {
		
		HashMap<String, String> hm= new HashMap<>();
		
		hm.put("Id", "121");
		hm.put("Address", "Pune");
		hm.put("Name", "Amit");
		hm.put("Salary", "646747.32");
		hm.put(null, "empty");
		
	     for(Map.Entry<String, String> m: hm.entrySet()){
	    	 
	    	 System.out.println(m.getKey()+": "+m.getValue());
	     }
		
	}

}
