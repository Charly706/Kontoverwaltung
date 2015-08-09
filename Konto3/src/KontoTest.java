//Datei: Konto3/Konto.java
//Beispiel : Konstruktor
public class KontoTest {
	public static void main(String[] args) {
		Konto meinKonto;
		/*
		 * bisher: meinKonto = new Konto(); // Objekt erzeugen
		 * meinKonto.setKontonummer(4531088); // Kontonummer initialisieren
		 * meinKonto.setSaldo(0.00); // Kontostand initialisieren
		 */
		/* jetzt : */
		meinKonto = new Konto(4531088); // Konstruktor erzeugt Objekt und
										// initialisiert Attribute
		meinKonto.auszug();
	}
}