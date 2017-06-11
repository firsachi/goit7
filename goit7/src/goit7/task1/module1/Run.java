package goit7.task1_1;

import goit7.view_console.View;

public class Run {

	public static void main(String[] args) {
		
		View view = new View();
		Task11Controller controller = new Task11Controller(view);
		controller.start();

	}

}
