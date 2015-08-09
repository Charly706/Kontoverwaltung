//Datei: Konto3/Konto.java
//Beispiel : Konstruktor
public class Konto {
	private int kontonummer;
	private double saldo;

	// −−> Konstruktor
	public Konto(int nummer) {
		kontonummer = nummer;
		saldo = 0.0;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	// setKontonummer(nummer) entfernt

	public double getSaldo() {
		return saldo;
	}

	// setSaldo(betrag) entfernt
	public void einzahlen(double betrag) {
		saldo = saldo + betrag;
	}

	public void auszahlen(double betrag) {
		saldo = saldo - betrag;
	}

	public void auszug() {
		System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo
				+ " Euro");
	}
}