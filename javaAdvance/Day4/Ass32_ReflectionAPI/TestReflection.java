package javaAdvance.Day4.Ass32_ReflectionAPI;
import java.lang.*;
import java.lang.reflect.*;
import java.util.Calendar;
public class TestReflection {
public static void main(String[] args) {
	
try {
	Class classObj = Employee.class;//Class.forName("javaAdvance.Day4.Ass32_ReflectionAPI.Employee");
	
	System.out.println("Class Name: "+classObj.getName());

	System.out.println("Access Modifier of Class: " +Modifier.toString(classObj.getModifiers())); //prints "
	
	
	Field[] field = classObj.getDeclaredFields();
	
	for(Field f: field) {
		
		System.out.println("variable: "+ f.getName());
		System.out.println("Variable Types: "+f.getType());
		
	}
	
	


}	
catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Exception: "+e.getMessage());
}








}
}
