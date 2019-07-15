package javaBasic.Day4.Assignment1;

public class Hostelite extends Student {
	 private String hostelName;
	 private Integer roomNumber;
	 
	 Hostelite() {
		// TODO Auto-generated constructor stub
	}
	 
	Hostelite(Integer Id, char type,String name,double fees,String hostelname,Integer room) {
	  //super(Id, type, name,"");
	 // super.setFeesPerMonth(fees);
	  this.hostelName=hostelname;
	  this.roomNumber=room;
	  /* Can't be access directly as they are set to private access specifers
	  this.studentId=Id;
	  this.feesPerMonth=fees;
	  this.studentType=type;
	  this.studentName=name;
	  */
	  
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hostelite host= new Hostelite(12,'B',"Sohail",5000.00,"Rock",100);
       
       System.out.println("Student id:"+host.getStudentId());
       System.out.println("Student Type:"+host.getStudentType());
       System.out.println("Student name:"+host.getStudentName());
       System.out.println("Student Fees:"+host.getFeesPerMonth());
       System.out.println("Student hostel name:"+host.getHostelName());
       System.out.println("Student Room no:"+host.getRoomNumber());
	}

}
