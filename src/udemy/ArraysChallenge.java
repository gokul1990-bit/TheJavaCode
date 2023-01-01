package udemy;

import java.util.Scanner;

public class ArraysChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray = getIntegers(5);
		int[] sorted = sortArray(firstArray);
		printArray(sorted);

	}

	private static int[] getIntegers(int array) {
		System.out.println("Enter " + array + " Integer Values.\r");
		int[] array1 = new int[array];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();
		}
		return array1;
	}

	private static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println("Element " + i + " contents are " + array[i]);

		}
	}

	private static int[] sortArray(int[] array1) {
		int[] sortedArray = new int[array1.length];
		for (int i = 0; i < sortedArray.length; i++) {

			sortedArray[i] = array1[i];

		}

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;

			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;

				}
			}

		}
		return sortedArray;

	}

}
