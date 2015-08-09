//Datei: Konto7/KontoTest.java
//Beispiel : Reimplenetierung
public class KontoTest {
	public static void main(String[] args) {
		Konto meinKonto = new Konto(4531088);
		meinKonto.einzahlen(400.00);
		meinKonto.auszug();
		System.out.println("Versuche 100 Euro abzuheben.");
		meinKonto.auszahlen(100.00); // Methode auszahlen(betrag) der Klasse
										// Konto
		meinKonto.auszug();
		System.out.println("Versuche 500 Euro abzuheben.");
		meinKonto.auszahlen(500.00); // Methode auszahlen(betrag) der Klasse
										// Konto
		meinKonto.auszug();
		System.out.println();
		Girokonto meinGirokonto = new Girokonto(1733065, 100);
		meinGirokonto.einzahlen(400.00);
		meinGirokonto.auszug();
		System.out.println("Versuche 100 Euro abzuheben.");
		meinGirokonto.auszahlen(100.00); // Methode auszahlen(betrag) der Klasse
											// Girokonto
		meinGirokonto.auszug();
		System.out.println("Versuche 500 Euro abzuheben.");
		meinGirokonto.auszahlen(500.00); // Methode auszahlen(betrag) der Klasse
											// Girokonto
		meinGirokonto.auszug();
	}
}