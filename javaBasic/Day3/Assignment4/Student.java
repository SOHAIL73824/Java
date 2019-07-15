package javaBasic.Day3.Assignment4;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	public Student() {
		this.studentId = 10;
		this.studentType = 'F';
	}
	public Student(int id, char studentType, String fName, String lName) {
		this.studentId = id;
		this.studentType = studentType;
		this.studentName = fName + " "+ lName;
		
	}
	public static void main(String[] args) {
		Student student1;
		student1 = new Student();
		student1.setStudentName("Denis", " Rock");
		System.out.println("Student Id: "+ student1.getStudentId());
		System.out.println("Student Type: "+ student1.getStudentType());
		System.out.println("Student Type: "+ student1.getStudentName());
		
		Student student3 = new Student(12, 'Y', "Mark", "Fellow");
		System.out.println("Student Id: "+ student3.getStudentId());
		System.out.println("Student Type: "+ student3.getStudentType());
		System.out.println("Student Type: "+ student3.getStudentName());
		
	}
	public String getStudentName() {
		return studentName;
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
	public void setStudentName(String fName, String lName) {
		this.studentName = fName + lName;
	}

	

}
