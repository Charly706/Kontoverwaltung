//Datei: Konto9/Konto.java
//Beispiel : Ueberladen
class Konto {
	static int zaehler = 0;
	protected int kontonummer;
	protected double saldo;

	Konto(int nummer) { // bisheriger Konstruktor mit 1 Parameter
		zaehler = zaehler + 1;
		kontonummer = nummer;
		saldo = 0.00;
	}

	Konto(int nummer, double betrag) { // weiterer Konstruktor mit 2 Parametern
		zaehler = zaehler + 1;
		kontonummer = nummer;
		saldo = betrag;
	}
	// die bereits bekannten Methoden wurde hier weggelassen
}