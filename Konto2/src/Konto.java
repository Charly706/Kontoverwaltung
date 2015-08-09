//Datei: Konto2/Konto.java
//Beispiel : Datenkapselung
public class Konto {
	private int kontonummer; // −−> Datenkapselung
	private double saldo;

	// neue Methoden fuer sicheren Zugriff auf Attribut kontonummer
	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int nummer) {
		kontonummer = nummer;
	}

	// neue Methoden fuer sicheren Zugriff auf Attribut saldo
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double betrag) {
		saldo = betrag;
	}

	// urspruengliche Methoden
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