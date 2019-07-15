package javaBasic.Day4.Assignment2;

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
		  this.studentId=Id;
		  this.feesPerMonth=fees;
		  this.studentType=type;
		  this.studentName=name;
	}
	
	public String getHostelName() {
		return this.hostelName;
	}
	
	public Integer getRoomNumber() {
		return this.roomNumber;	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hostelite host= new Hostelite(13,'C',"Sohail",5000.00,"Rock",100);
       
       System.out.println("Student id:"+host.getStudentId());
       System.out.println("Student Type:"+host.getStudentType());
       System.out.println("Student name:"+host.getStudentName());
       System.out.println("Student Fees:"+host.getFeesPerMonth());
       System.out.println("Student hostel name:"+host.getHostelName());
       System.out.println("Student Room no:"+host.getRoomNumber());
	}

}
