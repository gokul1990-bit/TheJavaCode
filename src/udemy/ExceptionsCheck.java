package udemy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 99;
//
//		int y = 0;

//		System.out.println(divideLBYL(x, y));
//
//		System.out.println(divideEAFP(x, y));

		int x = getEAFP();

		System.out.println(" x is " + x);

	}

	private static int getInt() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");

		return scanner.nextInt();

	}

	private static int getLBYL() {

		Scanner s = new Scanner(System.in);

		boolean isValid = true;

		System.out.println("Enter the user input");

		String input = s.next();

		for (int i = 0; i < input.length(); i++) {

			if (!Character.isDigit(input.charAt(i))) {

				isValid = false;
				break;
			}

		}

		if (isValid) {

			return Integer.parseInt(input);
		}

		// System.out.println("Enter the number");

		return 0;

	}

	private static int getEAFP() {
		Scanner y = new Scanner(System.in);

		System.out.println("Please enter a integer");

		try {

			return y.nextInt();
		}

		catch (InputMismatchException e) {

			return 0;
		}

	}

	private static int divideLBYL(int x, int y) {

		if (y != 0) {

			return x / y;

		}

		else {

			return 0;
		}

	}

	private static int divideEAFP(int x, int y) {
		try {

			return x / y;

		} catch (ArithmeticException e) {

			System.out.println("The arithmetic exception was caught and handled very well");

			return 0;

		}

	}

}
