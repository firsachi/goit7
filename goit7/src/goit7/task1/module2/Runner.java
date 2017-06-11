package goit7.task1.module2;

import goit7.view_console.View;

public class Runner {

	public static void main(String[] args) {
		
		View view = new View();
		Module2Model model = new Module2Model();
		Module2Controller controller = new Module2Controller(view, model);
		controller.start();
	}

}
