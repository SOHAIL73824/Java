package javaBasic.Day4.Assignment8;

public class Hostelite extends Student {
	 private String hostelName;
	 private Integer roomNumber;
	 
	 Hostelite() {
		// TODO Auto-generated constructor stub
	}
	 
	public Hostelite(Integer Id, char type,String name,double fees,String hostelname,Integer room) {
		 //super(Id, type, name,"");
		 // super.setFeesPerMonth(fees);
		  this.hostelName=hostelname;
		  this.roomNumber=room;
		  this.setStudentId(Id);
		  this.setFeesPerMonth(fees);
		  this.setStudentType(type);
		  this.setStudentName(name);
	}
	
	public String getHostelName() {
		return this.hostelName;
	}
	
	public Integer getRoomNumber() {
		return this.roomNumber;	}
	
	public void displayStudentDetails() {
		 System.out.println("Hostelite details");   
		super.displayStudentDetails();
		   System.out.println("Student hostel name:"+this.hostelName);
	       System.out.println("Student Room no:"+this.roomNumber);
		
	}

	@Override
	public void calculateFees(double fees) {
		// TODO Auto-generated method stub
		this.feesPerMonth=fees/6.0;
		
		this.feesPerMonth=this.feesPerMonth+1200;
		
	}

}
