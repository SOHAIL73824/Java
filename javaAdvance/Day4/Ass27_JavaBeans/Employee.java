package javaAdvance.Day4.Ass27_JavaBeans;

import java.util.Calendar;

public class Employee{
int employeeID;
String employeeName;
Calendar dateOfBirth;
public int getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Calendar getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Calendar dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
}