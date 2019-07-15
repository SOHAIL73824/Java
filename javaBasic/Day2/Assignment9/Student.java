package javaBasic.Day2.Assignment9;


public class Student {

	public static int studentId=500;
	public char studentType;
	public String studentName;
	
	public Student(){
		studentId+=1;
	}
	
	Student(char c,String f,String l){
		this();
		this.studentType=c;
		this.studentName=f+" "+l;
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
		System.out.println(s.getStudentId()+":"+s.getStudentName()+":"+s.getStudentType());
	}
	
}
