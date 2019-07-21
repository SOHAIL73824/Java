package javaAdvance.Day1.Ass9_MethodOverloding;
public class Wells { 

public static void main (String[] args) { 
	 EmployeeGrade elvis = new EmployeeGrade(); 
	 elvis.initializeEmpoyee(101, "Stark", 4.1f, 3.9f, 4.3f); 
	 elvis.calculateAverageFeedback();
	 elvis.calculateGrade();
	 elvis.displayInfo();
	 EmployeeGrade martha = new EmployeeGrade(); 
	 martha.initializeEmpoyee(101, "Philips", 3.5f, 4.5f); 
	 martha.calculateAverageFeedback();
	 martha.calculateGrade();
	 martha.displayInfo();
	 } 
 }