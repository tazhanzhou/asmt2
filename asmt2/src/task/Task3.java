package task;

public class Task3 {
	public int[] middleTwo(int[] array1, int[] array2) {
		int[] result = new int[2];
		
		result[0] = array1[array1.length/2];
		result[1] = array2[array2.length/2];
		
		return result;
	}

}
