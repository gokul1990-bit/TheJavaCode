package udemy;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] defaultArray = { 1, 3, 5, 77, 9 };

		System.out.println("The default array is " + Arrays.toString(defaultArray));

		Reverse(defaultArray);

		System.out.println("The reversed array is " + Arrays.toString(defaultArray));

	}

	private static void Reverse(int[] array) {

		int temp;

		int maxIndex = array.length - 1;

		int halfLength = array.length / 2;

		for (int i = 0; i < halfLength; i++) {

			temp = array[i];

			array[i] = array[maxIndex - i];

			array[maxIndex - i] = temp;

		}

	}

}
