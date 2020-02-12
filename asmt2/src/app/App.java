package app;

import task.Task1;
import task.Task2;
import task.Task3;

public class App {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array2 = new int[] { 1, 2, 3 };
		int[] array3 = new int[] { 4, 5, 6 };
//task 1
		Task1 task1 = new Task1();
		int[] result1 = task1.middle(array1);

		
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}
		System.out.println(" ");
//task 2
		Task2 task2 = new Task2();
		int[] result2 = task2.shift(array1);
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
		System.out.println(" ");
//task 3
		Task3 task3 = new Task3();
		int[] result3 = task3.middleTwo(array2, array3);
		for (int i = 0; i < result3.length; i++) {
			System.out.print(result3[i] + " ");
		}
	}

}
