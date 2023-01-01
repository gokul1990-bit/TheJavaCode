package udemy;

import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[10];

		int[] intArray = new int[10];

		ArrayList<String> strArrayList = new ArrayList<String>();

		strArrayList.add("Gokul");

		ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();

		intArrayList.add(new IntClass(87));

		Integer integer = new Integer(55);

		// Double double = new Double(12.25);

		ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			intArrayList1.add(Integer.valueOf(i));

		}

		for (int i = 0; i < 10; i++) {

			System.out.println(i + " --> " + intArrayList1.get(i).intValue());

		}

	}

}
