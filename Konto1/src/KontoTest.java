// Datei: Konto1/KontoTest.java
// Beispiel : Aggregierung und Kopplung
public class KontoTest {
	public static void main(String[] args) {
		Konto meinKonto; // Variable vom Typ Konto
		meinKonto = new Konto(); // new erzeugt Instanz der Klasse Konto
		meinKonto.kontonummer = 4531088; // Zugriff auf Attribute
		meinKonto.saldo = 200.00;
		System.out.println("Kontonummer: " + meinKonto.kontonummer + " Saldo: "
				+ meinKonto.saldo);
		meinKonto.einzahlen(300.00); // Methodenaufruf
		meinKonto.auszug();
		System.out.println();
		Konto deinKonto = new Konto(); // deinKonto zeigt auf neue Instanz der
										// Klasse Konto
		deinKonto.kontonummer = 1733065;
		deinKonto.saldo = 1000.00;
		deinKonto.auszug();
		deinKonto.auszahlen(100.00);
		deinKonto.auszug();
	}
}