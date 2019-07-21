package javaAdvance.Day4.Ass29_Using_this_Keyword;
public class WellsBank {

public static void main (String[] args) {
//Account acc = new Account();
Customer john = new Customer() ;

john.setCustomerId(101);
john.setCustomername("John");
john.setPincode(500054);
john.setCustomerAddress("Hyderabad");


System.out.println("Name : "+john.getCustomername());
System.out.println(john.getCustomername() +" Customer Id: "+john.getCustomerId());
System.out.println(john.getCustomername()+" Pincode: "+john.getPincode());
System.out.println(john.getCustomername() +" Customer Address: "+john.getCustomerAddress());
}}