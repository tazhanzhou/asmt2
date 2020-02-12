package task;

public class Task2 {
	public int[] shift(int[] array) {

		if (array.length > 0) {

			int temp = 0;
			for (int i = 0; i < array.length / 2; i++) {
				temp = array[i];
				array[i] = array[array.length - i - 1];
				array[array.length - i - 1] = temp;
			}

		} else {
			array[0] = 0;
			array[1] = 0;
		}

		return array;
	}

}
