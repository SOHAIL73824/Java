package javaBasic.Day4.Assignment4;

public class CourseRegistration {


		static protected int regId;
		protected String courseName;
		CourseRegistration(){
		regId++;
		}
		CourseRegistration (String cName){
		this();//Constructor call must be first in constructor	
		courseName=cName;
		
		}
		public void displayDetails(){
		System.out.println("Registration ID :"+regId);
		System.out.println("CourseName :"+courseName);
		}
		}



		class Student1 extends CourseRegistration{
			//Student
		protected int studentId;
		protected char studentType;
		protected String studentName;
		protected int semesterFees;   // Debug: Changed  to "Protected" to get access in DayScholar
		protected int feesPerMonth;   
		Student1(int studentId, String cName){
		super(cName);
		this.studentId=studentId;
		}
		Student1(int studentId,char studentType,String studName,int semFees,String cName){
		super(cName);
		this.studentType=studentType; // Debug: use"this" to point to current object and to differentiate
		
		studentName=studName;
		setSemesterFees(semFees);
		}
		public int getSemesterFees() {
			return semesterFees;
		}
		public void setSemesterFees(int semesterFees) {
			this.semesterFees = semesterFees;
		}
		public int getFeesPerMonth() {
			return feesPerMonth;
		}
		public void setFeesPerMonth(int feesPerMonth) {
			this.feesPerMonth = feesPerMonth;
		}

		}
		
		
		class DayScholar1 extends Student1{
			//Day Scholar

		private String residentialAddress;
		DayScholar1(int studentId,char studentType, String studName,int semFees, String residentialAddress, String cName){
		super(studentId,studentType,studName, semFees, cName);
		this.setResidentialAddress(residentialAddress);
		}
		
		
		public void displayDetails(){                  // Debug = use public access specifier. Reason :Cannot reduce the visibility of the inherited method from CourseRegistration
         super.displayDetails();
         
         
         System.out.println("Student id:"+this.studentId);
         System.out.println("Student Type:"+this.studentType);
         System.out.println("Student name:"+this.studentName);
         System.out.println("Student Fees per month:"+this.feesPerMonth);
         System.out.println("Student Semester fee"+this.semesterFees);
         System.out.println("Student Residential Address:"+this.residentialAddress);
         

		}
		public String getResidentialAddress() {
			return residentialAddress;
		}
		public void setResidentialAddress(String residentialAddress) {
			this.residentialAddress = residentialAddress;
		}

		}
		class CourseReg1{

		public static void main(String args[]){
		DayScholar1 dayscholar = new DayScholar1
		(1001,'D',"Eugene",12000,"No32/68 Vijayanagar","OOP");
		dayscholar.displayDetails();
		
		}
		}
