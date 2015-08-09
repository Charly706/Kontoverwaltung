//Datei: Konto9/Sparkonto.java
//Beispiel : Ueberladen
class Sparkonto extends Konto {
	private double zinssatz;

	Sparkonto(int nummer, double zins) { // bisheriger Konstruktor mit 2
											// Parameter
		super(nummer); // ruft 1−stelligen Konstruktor der Superklasse auf
		zinssatz = zins;
	}

	Sparkonto(int nummer, double betrag, double zins) { // weiterer Konstruktor
														// mit 3 Parametern
		super(nummer, betrag); // ruft 2−stelligen Konstruktor der Superklasse
								// auf
		zinssatz = zins;
	}
	// die bereits bekannten Methoden wurde hier weggelassen
}