package javaBasic.Day4.Assignment5;

public class Student {

		protected static int studentId;
		protected char studentType;
		protected String studentName;
		
		Student(){
		studentId+=1;
		}
		Student(int studentId,char studentType,String studName){
   	super();
	this.studentType=studentType; //this is used to point to current object
		this.studentName=studName;
		
		}
		
		}

	class PostGradstudent extends Student{
		
		protected int postCourseId;
	    protected String postCourseName;
		protected int postCourseFees;
		
		PostGradstudent(int pCourseId,String pCoursename,int pCourseFees,int sid,char sType,String sName){
			super(sid,sType,sName);
			this.postCourseId=pCourseId;
			this.postCourseName=pCoursename;
			this.postCourseFees=pCourseFees;
			}
		
		public int getPostCourseId() {
			return postCourseId;
		}
		
		public String getPostCourseName() {
			return postCourseName;
		}
		

	}
		class DayScholar extends PostGradstudent{

		private String residentialAddress;
		
		DayScholar(int pCourseId,String pCoursename,int pCourseFees,int sid,char sType,String sName,String rAddress){
		super(pCourseId,pCoursename,pCourseFees,sid,sType,sName);	
		this.residentialAddress=rAddress;
		
		}
		
		public void calculateFees() {
			this.postCourseFees = this.postCourseFees/6;
		}
		public int getFees() {
			calculateFees();
			
			System.out.println("PCourse id:"+this.postCourseId);
			System.out.println("pCourse name"+this.postCourseName);
			System.out.println("Student Type"+this.studentType);
			return this.postCourseFees;
		}

		}
		class Test{

		public static void main(String args[]){
		DayScholar dayscholar = new DayScholar
		(5,"OOP",16000,1001,'D',"Manu","No 32/68 Vijayanagar");
		System.out.println(dayscholar.getFees());
}
		
		}