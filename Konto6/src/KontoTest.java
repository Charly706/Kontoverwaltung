//Datei: Konto6/KontoTest.java
//Beispiel : Vererbung
public class KontoTest {
	public static void main(String[] args) {
		Sparkonto meinSparkonto = new Sparkonto(5613990, 3.4);
		// jede Instanz der Klasse Sparkonto hat 3 Attribute
		System.out.print("Kontonummer: " + meinSparkonto.getKontonummer()); // geerbtes
																			// Attribut
		System.out.print(" Saldo: " + meinSparkonto.getSaldo() + " Euro"); // geerbtes
																			// Attribut
		System.out.println(" Zinssatz: " + meinSparkonto.getZinssatz()); // neu
																			// deklariertes
																			// Attribut
		// Methoden einzahlen(betrag), auszahlen(betrag) und auszug() koennen
		// verwendet werden
		meinSparkonto.einzahlen(250.00); // geerbte Methoden
		meinSparkonto.auszug();
		meinSparkonto.auszahlen(10.00);
		meinSparkonto.auszug();
		// ausserdem gibt es fuer Instanzen der Klasse Sparkonto die Methode
		// verzinsen()
		meinSparkonto.verzinsen(); // neu implementierte Methode
		meinSparkonto.auszug();
	}
}