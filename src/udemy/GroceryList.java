package udemy;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {

		groceryList.add(item);

	}

	public void printGroceryList() {

		System.out.println("You have " + groceryList.size() + " items in your grocery List");

		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + "." + groceryList.get(i));
		}

	}

	public void modifyGroceryItem(int position, String newItem) {

		groceryList.set(position, newItem);

		System.out.println("Position " + (position + 1) + " has been modified");

	}

	public void deleteGroceryList(int position) {

		String theItem = groceryList.get(position);

		groceryList.remove(position);
	}
	
	
	
	public String findItem(String itemName) {
		
		
		Boolean isPresent = groceryList.contains(itemName);
		return itemName;
	}

	public static void main(String[] args) {

	}

}
