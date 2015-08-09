//Datei: Konto7/Girokonto.java
//Beispiel : Reimplementierung
public class Girokonto extends Konto {
	private double limit;

	public Girokonto(int nummer, double limit) {
		super(nummer);
		if (limit < 0)
			limit = -limit;
		this.limit = limit; // Parameter this zeigt auf das Objekt fuer das die
							// Methode aufgerufen wird
	}

	public double getLimit() {
		return limit;
	}

	// Methode fuer schreibenden Zugri ueberprueft ob limit postiv ist
	public void setLimit(double limit) {
		if (limit < 0)
			limit = -limit;
		this.limit = limit;
	}

	// −−> Reimplementierung
	public void auszahlen(double betrag) {
		if (betrag <= saldo + limit)
			super.auszahlen(betrag);
		else
			System.out.println("Limit ueberschritten!");
	}
}