//Datei: Konto6/Konto.java
//Beispiel : Vererbung
public abstract class Konto {
	static int zaehler = 0;
	protected int kontonummer; // Attribute sollen vererbt werden
	protected double saldo;

	public Konto(int nummer) {
		zaehler = zaehler + 1;
		kontonummer = nummer;
		saldo = 0.00;
	}

	// Implementierung der Methoden hier ausgelassen
	public int getKontonummer() {
		return kontonummer;
	}

	public double getSaldo() {
		return kontonummer;
	}

	public void einzahlen(double betrag) {
	}

	public void auszahlen(double betrag) {
	}

	public void auszug() {
	}
}