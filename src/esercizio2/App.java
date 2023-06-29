package esercizio2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 2 - - - - - - - - - -");
		System.out.println("");

		Scanner esercizioDue = new Scanner(System.in);

		System.out.println("Inserire un numero tra 0 e 3.");

		String numero = esercizioDue.nextLine();

		int numeroInt = Integer.parseInt(numero);

		stampaIntero(numeroInt);

		esercizioDue.close();

	}

	public static void stampaIntero(int _numero) {

		switch (_numero) {

		case 0:
			System.out.println("zero");
			break;

		case 1:
			System.out.println("uno");
			break;

		case 2:
			System.out.println("due");
			break;

		case 3:
			System.out.println("tre");
			break;

		default:
			System.out.println("Il numero inserito non è valido. Inserire un numero tra 0 e 3.");
			break;

		}

	}

}
