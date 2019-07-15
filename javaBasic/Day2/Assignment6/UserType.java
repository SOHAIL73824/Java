package javaBasic.Day2.Assignment6;

public class UserType {	
	String phone;
	String name;
	UserType(String parameterVal)
	{
		name= parameterVal;
	}
	
	UserType(){
		this("student");
	}

	public static void main(String[] args) {
		UserType u = new UserType("Faculty");
		UserType u2 = new UserType();
		
		System.out.println(u.name);
		System.out.println(u2.phone);
	}}