package javaAdvance.Day1.Ass8_Classes;
public class Wells { 

public static void main (String[] args) { 
	 EmployeeGrade elvis = new EmployeeGrade(); 
	 elvis.initializeEmpoyee(101, "Stark", 3.5f, 4.5f, 4.3f); 
	 elvis.calculateAverageFeedback();
	 elvis.calculateGrade();
	 elvis.displayInfo();
	 } 
 }