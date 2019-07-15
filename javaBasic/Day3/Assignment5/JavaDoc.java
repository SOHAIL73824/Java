package javaBasic.Day3.Assignment5;
public class JavaDoc {
	String userName;
	JavaDoc(String uName){
		this.userName = uName;
	}
	public int lengthOfString() {
		return this.userName.length();
	}
	 public String message() {
		 return "Hi! "+this.userName;
	 }
	 public String toUpper() {
		 return this.userName.toUpperCase();
	 }
	 public String toLower() {
		 return this.userName.toLowerCase();
	 }
	 public boolean startsWitha() {
		 return this.userName.matches("a.*");
	 }
	 public void replaceUName() {
		 this.userName = "KRISHNA";
	 }
	 public static void main(String[] args) {
		JavaDoc j = new JavaDoc("ASRock");
		System.out.println(j.startsWitha());
	}
	
}