package javaAdvance.Day4.Ass31_Generics;

import java.util.*;

public class EmployeeInfo {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmployeeID(101);
		Employee emp2 = new Employee();
		emp2.setEmployeeID(102);
		Employee emp3 = new Employee();
		emp3.setEmployeeID(103);
		Employee emp4 = new Employee();
		emp4.setEmployeeID(104);
		
		List<Employee> list =new  ArrayList<>();
		
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		
		Iterator<Employee> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next().getEmployeeID());
		}
		
		
		
	}

}
