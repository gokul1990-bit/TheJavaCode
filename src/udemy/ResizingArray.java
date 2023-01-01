package udemy;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingArray {

	private static int[] baseArray = new int[10];

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputArray(baseArray);

		resizeArray();

		System.out.println("After resizing " + Arrays.toString(baseArray));

	}

	private static int[] inputArray(int[] array) {

		for (int i = 0; i < array.length; i++)

		{
			array[i] = scanner.nextInt();
		}
		return array;

	}

	private static int[] resizeArray() {

		int[] newArray = baseArray;

		baseArray = new int[12];

		for (int i = 0; i < newArray.length; i++) {

			baseArray[i] = newArray[i];
		}

		return baseArray;

	}

}
