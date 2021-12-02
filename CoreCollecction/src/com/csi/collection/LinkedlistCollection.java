package com.csi.collection;

import java.util.LinkedList;

public class LinkedlistCollection {
	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<>();
		ll.add("Mechanical");
		ll.add("Computer");
		ll.add("IT");
		ll.add("Electrical");
		ll.add("Electronics");
		ll.remove(3);
		ll.addFirst("Raj");
		//ll.clear();
		ll.add(3, "CIVIL");
		
		
		//System.out.println(ll);
		//ll.forEach(System.out::println);
		//ll.forEach(bName->System.out.println(bName));
		
		for (String bName : ll) {
			System.out.println(bName);
			
		}
	}

}
