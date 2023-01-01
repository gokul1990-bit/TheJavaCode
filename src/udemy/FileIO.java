package udemy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub

		// FileWriter f1;
		try {
			FileWriter f1 = new FileWriter("C:\\Users\\ganga\\Desktop\\Aussies\\cricke.txt");

			f1.write("The data has been added in the filefff");
			f1.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// if (f1.createNewFile()) {

		// System.out.println("File Name is " + f1.getName());

	}

}
