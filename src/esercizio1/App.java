package esercizio1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");
		System.out.println("");

		Scanner esercizioUno = new Scanner(System.in);

		System.out.println("Inserire una stringa");

		String stringa = esercizioUno.nextLine();

		boolean trueFalse = stringaPariDispari(stringa);

		if (trueFalse == true) {
			System.out.println("");
			System.out.println("La stringa ha lunghezza pari");
		} else {
			System.out.println("");
			System.out.println("La stringa ha lunghezza dispari");
		}

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");
		System.out.println("");

		System.out.println("Inserire anno");

		String anno = esercizioUno.nextLine();

		int annoInt = Integer.parseInt(anno);

		boolean trueFalse2 = annoBisestile(annoInt);

		if (trueFalse2 == true) {
			System.out.println("");
			System.out.println("Anno bisestile");
		} else {
			System.out.println("");
			System.out.println("Anno non bisestile");
		}

		esercizioUno.close();

	}

	public static boolean stringaPariDispari(String _stringa) {
		int lunghezzaStringa = _stringa.length();
		if (lunghezzaStringa % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean annoBisestile(int _anno) {
		if (_anno % 4 == 0 || (_anno % 100 == 0 && _anno % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
