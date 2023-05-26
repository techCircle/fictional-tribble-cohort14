package testNG_Topics;

public class MessageUtil {
	
	private String message;
	
	
	public MessageUtil() {
	}
	
	public MessageUtil(String message) {
		 this.message = message; 
	}
	
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutionMessage() {
		message = "techcircleschool" + message;
		return message;
	}
	
	public String exitMessage() {
		message = "www." + message;
		return message;
	}
	
	
	public void printMessageExceptionMessage() {
		System.out.println(message);
		int a =0;
		int b = 1/0;
	}
	

}
