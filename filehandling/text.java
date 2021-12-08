package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class text {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\abc");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found ");
		}
	}

}
