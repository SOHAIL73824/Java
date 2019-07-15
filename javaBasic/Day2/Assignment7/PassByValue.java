package javaBasic.Day2.Assignment7;

import javaBasic.Day2.Assignment5.Student;

public class PassByValue {
	

	public static void main (String args[]){
		int sId = 25;
		PassByValue val = new PassByValue();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are" + sId);
		
		Student s = new Student();
		s.setStudentId(25);
		System.out.println(s.getStudentId());
		
		val.passThevalue(s);
		System.out.println("The Student are: "+s.getStudentId());

	
	}
		public void passTheValueMethod(int sId)
		{
		sId = 10;
		System.out.println("The sId are" + sId);
		}
		
		private void passThevalue(Student s) {
			// TODO Auto-generated method stub
			s.setStudentId(10);
			System.out.println("Student Id : "+s.getStudentId());
		}

		}