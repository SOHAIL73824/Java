package javaBasic.Day4.Assignment4;

public class Student {

		protected int studentId;
		protected char studentType;
		protected String studentName;
		protected int semesterFees;
		protected int feesPerMonth;
		Student(int studentId){
		this.studentId=studentId;
		}
		Student(int studentId,char studentType,String studName,int

		semFees){
		super();
		this.studentType=studentType; //this is used to point to current object
		studentName=studName;
		semesterFees=semFees;
		}
		void displayDetails(){

		}

		}
		class DayScholar extends Student{

		private String residentialAddress;
		DayScholar(int studentId,char studentType ,String studName,int semFees,String residentialAddress){
			super(studentId,studentType,studName,semFees); ///Constructor call must be the first statement in a constructor
			this.setResidentialAddress(residentialAddress);
		
		

		}
		void displayDetails(){
		}
		public String getResidentialAddress() {
			return residentialAddress;
		}
		public void setResidentialAddress(String residentialAddress) {
			this.residentialAddress = residentialAddress;
		}

		}
		class CourseReg{

		public static void main(String args[]){
		DayScholar dayscholar = new DayScholar
		(1001,'D',"Eugene",12000,"No 32/68 Vijayanagar");
		dayscholar.displayDetails();
}
		
		}