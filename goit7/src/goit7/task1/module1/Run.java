package goit7.task1.module1;

import goit7.view_console.View;

public class Run {

	public static void main(String[] args) {
		
		View view = new View();
		Module1Controller controller = new Module1Controller(view);
		controller.start();

	}

}
