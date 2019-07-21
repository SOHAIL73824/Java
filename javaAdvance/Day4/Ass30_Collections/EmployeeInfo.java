package javaAdvance.Day4.Ass30_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class EmployeeInfo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> employeeId = new ArrayList<>();
		employeeId.add(1001);
		employeeId.add(1002);
		//employeeId.add(“1003”);
		for (int count=0;count<employeeId.size();count++) {
				
			int a = employeeId.get(count);
			System.out.println(a);
			
        }
		
	}

}
