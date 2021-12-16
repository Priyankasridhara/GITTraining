package ExampleTDD.src.com.sonata.ExceptionTest;

public class MessageException {
       
	 private String message;
	
	public MessageException(String message){
		this.message = message;
	}
	
	public void printMessage(){
		int x[]={10,12};
		System.out.println(x[1]);
	}
	
	public String addMessage(){
		message = "Hi" + message;
		System.out.println(message);
		return message;
	}
}
