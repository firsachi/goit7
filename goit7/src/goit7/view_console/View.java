package goit7.view_console;

public class View {
	
	public void message(String message){
		System.out.println(message);
	}
	
	public void message(String baseString, String message){
		message(String.format(baseString, message));
	}

}
