package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\lucaj\\OneDrive\\Área de Trabalho\\in.txt");
		Scanner in = null;
		

		try {
			in = new Scanner(file);
			while (in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (in != null) {
				in.close();
			}
			System.out.println("df");
		}

	}

}
