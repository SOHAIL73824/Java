package javaAdvance2.Day1.Ass1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer{ 
	public void printCustomers(List<String> arrayList){ 
		 Iterator<String> iterator=arrayList.iterator(); 
		 System.out.println("Customers list are : "); 
		 while(iterator.hasNext()){ 
			 System.out.println(iterator.next()); 
			 } 
		 } 
	public static void main(String args[]){ 
		  
		List<String> list=new ArrayList<String>(); 
		list.add("Jack"); 
		list.add("Jill"); 
		list.add("Tabrez"); 
		list.add("Cheetu"); 
		AddCustomer addCustomer=new AddCustomer(); 
		addCustomer.printCustomers(list);
		
		} 
}