package javaBasic.Day4.Assignment1;


public class Student {

	private Integer studentId;
	private  double feesPerMonth;
	private char studentType;
	private String studentName;
	
	
	public Student(){
	
	}
	
	public Student(int id,char type, String firstname, String lastName){
	 this.studentId=id;
	 this.studentType=type;
	 this.studentName=firstname+" "+lastName;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	
	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	


	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
}
