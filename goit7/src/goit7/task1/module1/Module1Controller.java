package goit7.task1.module1;

import java.util.Scanner;

import goit7.view_console.Messages;
import goit7.view_console.View;

public class Module1Controller {
	
	private View view;

	public Module1Controller(View view) {
		this.view = view;
	}
	
	public void start(){
		view.message(Messages.INPUT_NAME);
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		view.message(Messages.HELLO_USER, name);
	}

}
