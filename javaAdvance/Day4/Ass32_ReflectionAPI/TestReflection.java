package javaAdvance.Day4.Ass32_ReflectionAPI;
import java.lang.*;
import java.lang.reflect.*;
import java.util.Calendar;
public class TestReflection {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	
try {
	Class classObj = Class.forName("javaAdvance.Day4.Ass32_ReflectionAPI.Employee");
	
	System.out.println("Class Name: "+classObj.getName());

	System.out.println("Access Modifier of Class: " +Modifier.toString(classObj.getModifiers())); //prints "
	
	Employee privateObject = new Employee(1);

	Field privateStringField = Employee.class.
	            getDeclaredField("privateString");

	privateStringField.setAccessible(true);

	String fieldValue = (String) privateStringField.get(privateObject);
	System.out.println("fieldValue = " + fieldValue);


	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Exception: "+e.getMessage());
}








}
}