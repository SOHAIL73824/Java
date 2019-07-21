package javaAdvance.Day3.Ass25_CheckedException;

public class CheckedExceptionDemo {
	public static void main(String arg[]) { 
		try {
			Class.forName("javaAdvance.Day3.Ass25_CheckedException.ExceptionDemo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception :"+e);
		} 
		} 

}
