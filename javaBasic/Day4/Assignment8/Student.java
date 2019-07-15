package javaBasic.Day4.Assignment8;


public abstract class Student {

	protected Integer studentId;
	protected  double feesPerMonth;
	protected char studentType;
	protected String studentName;
	
	
	
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
	
	public abstract void calculateFees(double fees);
	
	public void displayStudentDetails() {
		
	       System.out.println("Student id:"+this.studentId);
	       System.out.println("Student Type:"+this.studentType);
	       System.out.println("Student name:"+this.studentName);
	       System.out.println("Student Fees:"+this.feesPerMonth);
	    
		
	}
	
}
