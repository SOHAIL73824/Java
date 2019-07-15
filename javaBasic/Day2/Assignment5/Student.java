package javaBasic.Day2.Assignment5;

public class Student {

	private int studentId;
	private char studentType;
	
	public Student(){
		studentId=10;
		studentType='F';
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	public static void main(String[] args) {
		Student s= new Student();
		
		System.out.println("Student Id: "+s.getStudentId());
		System.out.println("Student Type: "+s.getStudentType());
	}
	
}
