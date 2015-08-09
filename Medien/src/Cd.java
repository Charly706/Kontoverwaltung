// Datei: Medien/Cd.java
public class Cd extends Medium {
	protected String interpret;
	protected int titelanzahl;
	protected int spieldauer;

	public Cd(String titel, String interpret, int titelanz, int zeit,
			double preis) {
		super(titel, preis);
		this.interpret = interpret;
		this.titelanzahl = titelanz;
		this.spieldauer = zeit;
	}

	public String getInterpret() {
		return this.interpret;
	}

	public int getTitelanzahl() {
		return this.titelanzahl;
	}

	public int getSpieldauer() {
		return this.spieldauer;
	}

	@Override
	public void druckeInfo() {
		System.out.println("Code: " + this.code);
		System.out.println("Titel: " + this.titel);
		System.out.println("Interpret: " + this.interpret);
		System.out.println("Spieldauer: " + this.spieldauer + " min, "
				+ this.titelanzahl + " Titel");
		System.out.println("Preis: " + this.preis + " Euro");
		System.out.println("Kommentar: " + this.kommentar);
		System.out.println();
	}
}