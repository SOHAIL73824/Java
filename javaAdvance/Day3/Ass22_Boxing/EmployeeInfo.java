package javaAdvance.Day3.Ass22_Boxing;

import java.util.Vector;

public class EmployeeInfo{
	
	public static void main (String[] args) { 
	
		Vector empList = new Vector(); 
		int empNo=1000; 
		for(int count=0;count<5;count++) { 
			empNo++; 
			Integer emp = (Integer) empNo;
			empList.add(emp);
		
		}
		for(int i=0;i<empList.size();i++) {
			System.out.println(empList.get(i));
		}
	 } 
	
	
	
}