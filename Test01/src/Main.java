import java.io.*;
import java.util.Scanner;

public class Main {

	private String firmenName;
	private String adresse;
	private String bank;

	private static String cfgFile = "myconf.cfg";

	public static void main(String[] args) {

		File tempFile = new File("ci/temp/temp.txt");

		boolean exists = tempFile.exists();

		Scanner scan = new Scanner(System.in);

		// falls Datei nicht existiert, anlegen
		if (exists == false) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(cfgFile)) {

				System.out.println("Firmenname: ");
				String firma = scan.nextLine();

				//char value = '"';

				bw.write("Firmenname =" + firma);

			} else {
				try (BufferedReader br = new BufferedReader(new Fileeader(cfgFile)))
				String firma = readLine(); 
			}

			catch (IOException e) {

			}
		}

	}

}
