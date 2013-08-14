package aufgabenblatt05;

public class Aufgabe01 {

	// add Funktion funktioniert nur mit positiven werten
	// fragt sich nur wie man eine richtigen Test dafür schreibt...
	public static void main(String[] args) {
		int[] a = new int[] { 3, 4, 2 };
		int[] b = new int[] { -1, -1, -1 };
		int[] berechnet = addVektoren(a, b);
		printList(berechnet);
	}

	static void printList(int[] liste) {
		for (int i = 0; i < liste.length; i++) {
			System.out.print(liste[i] + ", ");
		}
		System.out.println();
	}

	public static int[] addVektoren(int[] a, int[] b) {
		if (a.length != b.length)
			return null;
		int[] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= Integer.MAX_VALUE - b[i])
				return null;
			sum[i] = a[i] + b[i];
		}
		return sum;
	}

}
