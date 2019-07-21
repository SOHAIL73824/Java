package javaAdvance.Day1.Ass11_ArrayOfObject;
public class Wells { 

public static void main (String[] args) { 
	 EmployeeGrade [] employee = new EmployeeGrade[5];
	 employee[0] = new EmployeeGrade(102,"Hames",3.2f,4.4f,2.1f); 
	 employee[1] = new EmployeeGrade(103,"Marcus",3.2f,3.4f,3.2f);
	
	
	 for(int i=0;i<employee.length;i++) {
		 employee[i].calculateAverageFeedback();
		 employee[i].calculateGrade();
		 employee[i].displayInfo();
		 
	 }
	 } 
 }