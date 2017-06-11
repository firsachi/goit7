package goit7.task1.module2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import goit7.view_console.Messages;
import goit7.view_console.View;

public class Module2Controller {
	
	private int[] numbers;
	private View view;
	private Module2Model model;
	
	public Module2Controller(View view, Module2Model model) {
		this.view = view;
		this.model = model;
		numbers = new int[5];
	}
	
	public void start(){
		view.message(Messages.INPUT_ARRAY_INTEGER);
		Scanner scanner = new Scanner(System.in);
		int sizeArray = numbers.length;
		for (int i = 0; i < sizeArray; i++){
			numbers[i] = inputNumber(scanner);
		}
		scanner.close();
		view.message(Messages.PRINT_ARRY);
		view.message(Arrays.toString(numbers));
		int sortArray[] = model.sortArray(numbers);
		view.message(Messages.SORT);
		view.message(Arrays.toString(sortArray));
		int reverse[] = model.reverseSort(numbers);
		view.message(Messages.MESSAGE_REVERSE);
		view.message(Arrays.toString(reverse));
	}
	
	
	private int inputNumber(Scanner scanner){
		int result = 0;
		try {
			view.message(Messages.INPUT_ELEMENT);
			result = scanner.nextInt();
			return result;
		}catch (InputMismatchException e) {
			view.message(Messages.ERROR_NOT_NUMBER);
			scanner.nextLine();
			inputNumber(scanner);
		}
		return result;
	}

}
