package udemy;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f1 = new File("C:\\Users\\ganga\\Desktop\\Aussies\\Cricke.txt");

			Scanner s = new Scanner(f1);

			while (s.hasNextLine()) {

				String data = s.nextLine();

				System.out.println(data + "kkkk");
			}

			s.close();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}
}
