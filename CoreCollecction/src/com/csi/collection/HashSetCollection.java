package com.csi.collection;

import java.util.HashSet;

public class HashSetCollection {
	public static void main(String[] args) {
		
		HashSet<String> Hs= new HashSet<>();
		Hs.add("Computer");
		Hs.add("Mechanical");
		Hs.add("IT");
		Hs.add("Electrical");
		Hs.add("Electronics");
		Hs.add("Computer");
		
		//System.out.println(Hs);
		//Hs.forEach(System.out::println);
		//Hs.forEach(bName->System.out.println(bName));
		for (String bName : Hs) {
			System.out.println(Hs);
			
		}
	}

}
