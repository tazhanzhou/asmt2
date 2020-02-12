package task;

public class Task1 {
	public int[] middle(int array[]) {
		int[] result = new int[2];

		if (array.length > 0 && array.length % 2 == 0) {
			result[0] = array[array.length / 2 - 1];
			result[1] = array[array.length / 2];

		} else {
			result[0] = 0;
			result[1] = 0;
		}

		return result;
	}

}
