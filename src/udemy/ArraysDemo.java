package udemy;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] subArray = { 2, 46, 9, 12, 16, 32, 67 };

		for (int i = 0; i < subArray.length; i++) {

			System.out.println("The arrays values are " + subArray[i]);
		}

		printArray(subArray);

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println("The queue number is " + i + " And the value is " + array[i]);
		}

	}

}
