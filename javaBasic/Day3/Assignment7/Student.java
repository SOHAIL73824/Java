package javaBasic.Day3.Assignment7;

public class Student {
	private int studentId;
	private String residentialStatus;
	private String studentName;
	private long feesPerMonth;
	public Student() {
		
	}

	public static void main(String[] args) {
		int id= Integer.valueOf(args[0]);
		String name = args[1];
		String status = args[2];
		int fee = Integer.valueOf(args[3]);
		if(status.equals("Hostelite")) {
			int hostelfee = Integer.valueOf(args[4]);
			fee+=hostelfee;
			
		}
		
		Student student1;
		student1 = new Student();
		student1.setStudentName(name, "");
		student1.setStudentId(id);
		student1.setFeesPerMonth(fee);
		student1.setResidentialStatus(status);
		
		System.out.println("Student Id: "+ student1.getStudentId());
		System.out.println("Student Status: "+ student1.getResidentialStatus());
		System.out.println("Student Name: "+ student1.getStudentName());
		System.out.println("Student fee: "+ student1.getFeesPerMonth());
		
		
		
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
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
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setStudentName(String fName, String lName) {
		this.studentName = fName + lName;
	}
	public long getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	

}
