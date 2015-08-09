//Datei: Konto9/Girokonto.java
//Beispiel : Ueberladen
class Girokonto extends Konto {
	private double limit;

	Girokonto(int nummer, double limit) { // bisheriger Konstruktor mit 2
											// Parameter
		super(nummer); // ruft 1−stelligen Konstruktor der Superklasse auf
		if (limit < 0)
			limit = -limit;
		this.limit = limit;
	}

	Girokonto(int nummer, double betrag, double limit) { // weiterer Konstruktor
															// mit 2 Parametern
		super(nummer, betrag); // ruft 2−stelligen Konstruktor der Superklasse
								// auf
		if (limit < 0)
			limit = -limit;
		this.limit = limit;
	}
	// die bereits bekannten Methoden wurde hier weggelassen
}