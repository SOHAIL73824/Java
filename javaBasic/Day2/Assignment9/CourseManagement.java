package javaBasic.Day2.Assignment9;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Student s = new Student('D',"Bony","Thomas");
		//System.out.println("Student Number: "+s.getStudentId()+";Student Type:"+s.getStudentType()+";Student Name: "+s.getStudentName());
        s.displayDetails(s);
		
		Student s1 = new Student('F',"Rao","Clarke");
		s1.displayDetails(s1);
		//System.out.println("Student Number: "+s1.getStudentId()+";Student Type:"+s1.getStudentType()+";Student Name: "+s1.getStudentName());

	}


}
