package banking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {

	public static void main(String[] args) { // TODO Auto-generated method stub

		Buffered fi = new Buffered();
		String strTextFile = "C:\\Users\\ganga\\Desktop\\records.txt";
		fi.readFile(strTextFile);

		String strTextData = "BJP win will in 2024 parliment elections";

		fi.WriteFile(strTextFile, strTextData);
		fi.readFile(strTextFile);
	}

	public void WriteFile(String strFile, String strData) {
		try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter(strFile, true))) {

			bufWriter.write(strData);
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readFile(String strFile) {
		String strBuffer;
		try (BufferedReader buffRead = new BufferedReader(new FileReader(strFile))) {
			while ((strBuffer = buffRead.readLine()) != null) {
				System.out.println(strBuffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
