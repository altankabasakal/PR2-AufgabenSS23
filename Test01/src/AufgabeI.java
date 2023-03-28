import java.util.Scanner;

public class AufgabeI {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		int alter = s1.nextInt();

		String name = s1.next();

		System.out.println("Dein Name: " + name + " Dein Alter: " + alter);

		s1.close();

	}

}
