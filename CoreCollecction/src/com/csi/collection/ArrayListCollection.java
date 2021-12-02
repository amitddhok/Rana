package com.csi.collection;
//changes done
import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		al.add("Computer");
		al.add("Mechanical");
		al.add("Electrical");
		al.add("It");
		al.add("computer");
		//System.out.println(al);
		//al.forEach(System.out::println);
		//al.forEach(bName->System.out.println(bName));
		for (String bName : al) {
			System.out.println(bName);
			
		}
		
		
		
		
		
	}

}
