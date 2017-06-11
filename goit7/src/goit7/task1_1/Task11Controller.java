package goit7.task1_1;

import java.util.Scanner;

import goit7.view_console.Messages;
import goit7.view_console.View;

public class Task11Controller {
	
	private View view;

	public Task11Controller(View view) {
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
