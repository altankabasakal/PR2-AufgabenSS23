/*
 * 
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(System.in);

		String path = "\"C:\\Users\\noorm\\pr1.3\\PR2\\src\\ÜB2\\dat\"";

		File datei = new File(path);
		if (datei.exists()) {
			try {
				FileReader eing = new FileReader(datei);
				int c;
				while ((c = eing.read()) != -1)
					System.out.println((char) c);
			} catch (IOException ausnahme) {
				System.out.println("fehler " + ausnahme);
			}
		}

	}
}


}
*/
