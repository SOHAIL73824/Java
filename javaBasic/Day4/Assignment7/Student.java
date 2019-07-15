package javaBasic.Day4.Assignment7;
class Student {

protected Integer studentId;
protected char studentType;
protected String studentName;
protected final int semesterFees;
protected int feesPerMonth;

Student(){
	semesterFees = 12000;
}

public void setStudentId(Integer sId){
this.studentId=sId;
}
public void setStudentType(char sType){
this.studentType=sType;

}
public void setStudentName(String sName){
this.studentName=sName;

}

public void calculateFees() {
	
	this.feesPerMonth= (int) (this.semesterFees/6.0);
}


public final void displayDetail() {
    System.out.println("Student id:"+this.studentId);
    System.out.println("Student Type:"+this.studentType);
    System.out.println("Student name:"+this.studentName);
    System.out.println("Student Fees:"+this.feesPerMonth);
}
}
final class DayScholar extends Student{

private String residentialAddress;
DayScholar(){}

DayScholar(Integer id,char type, String name, double fees, String address){
	this.studentId=id;
	this.studentType=type;
	this.studentName=name;
	super.calculateFees();
	this.residentialAddress=address;
	
}


public void displayDaySDetails(){	
	super.displayDetail(); 
    System.out.println("Student hostel name:"+this.residentialAddress);
 
	}

	}
	class DynamicEx{

	public static void main(String args[]){
	DayScholar dayScholar=new DayScholar(1001,'D',"Thomas",3000,"No 32/2 Vijaynagar");
	
	dayScholar.displayDaySDetails();
	}
	}
