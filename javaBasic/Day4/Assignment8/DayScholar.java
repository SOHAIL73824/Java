package javaBasic.Day4.Assignment8;

public class DayScholar extends Student{
	private String residentialAddress ;
	
	public DayScholar() {
		
	}
	
	public DayScholar(Integer id, char type, String name,double fees,String address) {
		  this.studentId=id;
		  this.feesPerMonth=fees;
		  this.studentType=type;
		  this.studentName=name;
		  this.residentialAddress=address;
		
	}
	
	public String getResidentialAddress() {
		
		return this.residentialAddress;
	}
	
	public void displayStudentDetails() {
		System.out.println("DayScholar details");
		super.displayStudentDetails();		
		System.out.println("Student Address: " + this.residentialAddress);
	}
	
    @Override
	public void calculateFees(double fees) {
		// TODO Auto-generated method stub
		this.feesPerMonth=fees/6.0;
		
	}
	
	

}
