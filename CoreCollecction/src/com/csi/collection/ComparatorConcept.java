package com.csi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer{
	
	int custId;
	String custName;
	int custAge;
	public Customer(int custId, String custName, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]";
	}
	
	
}
class AgeComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if(c1.custAge==c2.custAge){
			
		
		return 0;
		}else if(c1.custAge>c2.custAge){
			return 1;
		}else{
			return -1;
		}
	}
	
}
class NameComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.custName.compareTo(c2.custName);
	}
	
}

public class ComparatorConcept {
	public static void main(String[] args) {
		List<Customer> csutList= new ArrayList<Customer>();
		csutList.add(new Customer(121, "Amit", 27));
		csutList.add(new Customer(131, "Raj", 31));
		csutList.add(new Customer(141, "Akshay", 40));
		csutList.add(new Customer(151, "Ranveer", 35));
		
		System.out.println("Age comparator");
			
		Collections.sort(csutList, new AgeComparator());
		csutList.forEach(System.out::println);
		
		System.out.println("name comparator");
		
		Collections.sort(csutList, new NameComparator());
		csutList.forEach(System.out::println);
		
	}
		
	}


