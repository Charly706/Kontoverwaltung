//Datei: Konto1/Konto.java
//Beispiel : Aggregierung und Kopplung
// --> Aggregierung
class Konto {
	// Attribute
	int kontonummer;
	double saldo;

	// Methoden
	void einzahlen(double betrag) {
		saldo = saldo + betrag; // −−> Kopplung
	}

	void auszahlen(double betrag) {
		saldo = saldo - betrag; // −−>Kopplung
	}

	void auszug() {
		System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo
				+ " Euro");
	}
}