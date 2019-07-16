package javaBasic.Day5.Ass2_Access_Specifiers;

import javaBasic.Day5.Ass1_Package.*;

class DayScholar extends Student{


public void getDetails(){
System.out.println("Student Id:"+studentId);
System.out.println("Student Type:"+studentType);
System.out.println("Student Name:"+studentName);
}

}
class Registration{

public static void main(String args[]){
DayScholar dayScholar=new DayScholar();
dayScholar.setStudentId(1001);
dayScholar.setStudentType('D');
dayScholar.setStudentName("Dinil");
dayScholar.getDetails();
}}