package esercizio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 4 - - - - - - - - - -");
		System.out.println("");

		Scanner esercizioQuattro = new Scanner(System.in);

		System.out.println("Inserire un numero intero");

		String numero = esercizioQuattro.nextLine();

		int numeroInt = Integer.parseInt(numero);

		System.out.println("Conto alla rovescia:");

		for (int i = numeroInt; i >= 0; i--) {
			System.out.println(i);
		}

		esercizioQuattro.close();

	}

}
