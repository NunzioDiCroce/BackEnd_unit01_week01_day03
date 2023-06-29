package esercizio3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String stringa;

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -");
		System.out.println("");

		Scanner esercizioTre = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("Inserire una stringa. Se scrivi :q blocchi il programma");

			stringa = esercizioTre.nextLine();
			if (!stringa.equals(":q")) {
				System.out.println(String.join(",", stringa.split("")));
			}
		} while (!stringa.equals(":q"));

		esercizioTre.close();

		System.out.println("");
		System.out.println("Fine programma");

	}

}
