package com.csi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	double empSalary;
	int empAge;
	

	public Employee(int empId, String empName, double empSalary, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}
	


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ "]";
	}



	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(e.empAge==empAge){
		return 0;
		}else if(e.empAge<empAge)
		{
			return 1;
		}else{
			return -1;
		}
	}
	
}


public class ComparableMethod {
	public static void main(String[] args) {
		List<Employee> employessList= new ArrayList<Employee>();
		employessList.add(new Employee(121, "Amit", 527552.23, 27));
		employessList.add(new Employee(131, "Sanjay", 753897.44, 31));
		employessList.add(new Employee(141, "Uttam", 2534644.21, 25));
		employessList.add(new Employee(151, "ajay", 890786.12, 29));
		
		//System.out.println(employessList);
		Collections.sort(employessList);
		employessList.forEach(System.out::println);
		
	}

}
