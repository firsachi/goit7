package goit7.task1.module2;

public class Module2Model {
	
	
	public int[] sortArray(int[] arg){
		int[] result = arg;
		int i = 1;
		int sizeArray = result.length;
		while(i < sizeArray) {
			if(i == 0 || result[i - 1] <= result[i]){
				i++;
			}else {
				int temp = result[i];
		        result[i] = result[i - 1];
		        result[i - 1] = temp;
		        i--;
			}
		}
		return result;
	}
	
	public int[] reverseSort(int[] arg){
		int[] result = arg;
		int sizeArray = result.length;
		int halfSize = result.length / 2;
		for (int i = 0; i < halfSize; i++){
			int tmp = result[i];
			int numberValue = sizeArray - i -1;
			result[i] = result[numberValue];
			result[numberValue] = tmp;
		}
		return result;
	}

}
