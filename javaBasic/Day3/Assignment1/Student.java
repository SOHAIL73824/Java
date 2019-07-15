package javaBasic.Day3.Assignment1;


public class Student {

	public static int studentId;
	static int studentCount;
	public char studentType;
	public String studentName;
	
	static{
		studentCount=10;
	}
	public Student(){
		studentCount+=1;
		studentId =studentCount;
	}
	

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	public void displayDetails(Student s) {
		System.out.println(s.getStudentId());
	}
	static int getStudentCount() {
		
		return studentCount;
	}
	
}
