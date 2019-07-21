package javaAdvance.Day4.Ass33_Annotations;
public class TestStringMock {
public static void main(String[] args) {
String message = "What's in the name";

StringMock st = new StringMock();

System.out.println(st.search("SOhail", 'S'));
//To-Do : create an object of StringMock class
//To-Do : Use search method to search for a character present
//in the array
System.out.println(st.search("Sohail", 'z'));

}

}