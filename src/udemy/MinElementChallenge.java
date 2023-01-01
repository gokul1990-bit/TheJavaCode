package udemy;

import java.util.Scanner;

public class MinElementChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Count");

		int count = scanner.nextInt();

		scanner.nextLine();

		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);

		System.out.println("Minimum Value is " + returnedMin);
	}

	private static int[] readIntegers(int count) {

		int[] array = new int[count];

		for (int i = 0; i < array.length; i++) {

			System.out.println("Enter a Number");

			scanner.nextLine();

			array[i] = scanner.nextInt();

		}

		return array;

	}

	private static int findMin(int[] array) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			int value = array[i];

			if (value < min) {

				min = value;
			}

		}

		return min;

	}

}
