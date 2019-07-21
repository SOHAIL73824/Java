package javaAdvance.Day1.Ass10b_Constructor;
public class Wells { 
 
	public static void main (String[] args) { 
	 EmployeeGrade ram = new EmployeeGrade(); 
	 EmployeeGrade james = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f); 
	 ram.calculateAverageFeedback();
	 ram.calculateGrade();
	 james.calculateAverageFeedback();
	 james.calculateGrade();
	 ram.displayInfo();
	 james.displayInfo();
	 } 
 }