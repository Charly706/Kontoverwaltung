//Datei: Konto8/KontoTest.java
//Beispiel : Polymorphismus
public class KontoTest {
	public static void main(String[] args) {
		Konto meinKonto; // Variable vom Typ Konto
		meinKonto = new Konto(4531088); // meinKonto zeigt auf ein Objekt vom
										// Typ Konto
		meinKonto.einzahlen(300.00);
		meinKonto.auszug();
		meinKonto.auszahlen(500.00); // Methode auszahlen(betrag) der Klasse
										// Konto wird aufgerufen
		meinKonto.auszug();
		System.out.println();
		meinKonto = new Girokonto(5613990, 100); // meinKonto zeigt jetzt auf
													// ein Objekt vom Typ
													// Girokonto
		meinKonto.einzahlen(300.00);
		meinKonto.auszug();
		meinKonto.auszahlen(500.00); // Methode auszahlen(betrag) der Klasse
										// Girokonto wird aufgerufen
		// −−> Polymorphismus & dynamische Bindung
		meinKonto.auszug();
		System.out.println();
		meinKonto = new Sparkonto(1733065, 1.25); // meinKonto zeigt jetzt auf
													// ein Objekt vom Typ
													// Sparkonto
		meinKonto.einzahlen(400.00);
		meinKonto.auszug();
		meinKonto.auszahlen(100.00); // Methode auszahlen(betrag) der Klasse
										// Sparkonto wird aufgerufen
		meinKonto.auszug();
		/*
		 * meinKonto.verzinsen(); // Fehler: die Klasse Konto kennt die Methode
		 * verzinsen() nicht
		 */
		((Sparkonto) meinKonto).verzinsen();
		meinKonto.auszug();
	}
}