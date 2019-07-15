package javaBasic.Day4.Assignment3;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=null ;
		
		if(args[0].equals("Hostelite")) {
			s= new Hostelite(13,'C',"Sohail",5000.00,"Rock",100);
		      
		}else if(args[0].equals("DayScholar")) {
			s= new DayScholar(13,'C',"Sohail",5000.00,"Rock-on-roll");
		     
		}
		else {
			System.out.println("Check the entered value...");
		}
		
       if(s!=null) {
    	   
    	  s.displayStudentDetails(); 
    	   
    	   
       }
		
		
		
	}

}
