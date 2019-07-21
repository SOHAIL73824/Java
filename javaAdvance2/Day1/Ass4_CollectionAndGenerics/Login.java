package javaAdvance2.Day1.Ass4_CollectionAndGenerics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login { 
	private Map<Integer, String> loginMap=new LinkedHashMap<Integer, String>(); 
	public void addLogin(int customerId,String password){ 
		//adding the input to the map 
		loginMap.put(customerId, password); 
		 
	}
}