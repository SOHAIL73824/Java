package javaBasic.Day2.Assignment4;

public class CourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		//System.out.println("Student Number: "+s.getStudentId()+";Student Type:"+s.getStudentType()+";Student Name: "+s.getStudentName());
        s.setStudentId(500);
        s.setStudentType('M');
		
		System.out.println(s.getStudentId()+":"+s.getStudentType());
		//System.out.println("Student Number: "+s1.getStudentId()+";Student Type:"+s1.getStudentType()+";Student Name: "+s1.getStudentName());

	}

}
