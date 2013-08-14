package aufgabenblatt05;

import static org.junit.Assert.*;

import org.junit.Test;

public class Aufgabe01test {

	// aus der VL übernommen PDF Tag 5
	// http://page.mi.fu-berlin.de/block/pi3_2013/algorithmenProgrammierungII_tag5.pdf
	@Test
	public void testAddVektorenMitUnterschiedlichenLängen() {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 1, 2 };
		assertNull(Aufgabe01.addVektoren(a, b));
		assertNull(Aufgabe01.addVektoren(b, a));
	}

	// siehe VL
	@Test
	public void testAddVektorenKomponentenweise() {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 1, 2, 4 };
		int[] erg = new int[] { 2, 4, 7 };
		int[] berechnet = Aufgabe01.addVektoren(a, b);
		assertArrayEquals(erg, berechnet);
		berechnet = Aufgabe01.addVektoren(b, a);
		assertArrayEquals(erg, berechnet);
	}

	// siehe VL
	@Test
	public void testAddVektorenKomponentenweiseMitÜberlauf() {
		int[] a = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE,
				Integer.MAX_VALUE };
		int[] b = new int[] { 1, 1, 1 };
		int[] berechnet = Aufgabe01.addVektoren(a, b);
		assertNull(berechnet);
		berechnet = Aufgabe01.addVektoren(b, a);
		assertNull(berechnet);
	}

	// analog zu VL soll testen was passiert wenn ein 'negativer Überlauf
	// satt findet
	@Test(expected = ArithmeticException.class)
	public void testAddVektorenKomponentenweiseMitNegÜberlauf() {
		int[] a = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE,
				Integer.MIN_VALUE };
		int[] b = new int[] { -1, -1, -1 };
		Aufgabe01.addVektoren(a, b);

	}

}
