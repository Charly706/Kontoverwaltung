// Datei: Medien/Medium.java
public class Medium {
	protected static int zaehler = 0;
	protected int code;
	protected String titel;
	protected double preis;
	protected String kommentar;

	public Medium(String titel, double preis) {
		this.zaehler += 1;
		this.code = 100000 + this.zaehler;
		this.titel = titel;
		this.preis = preis;
		this.kommentar = "";
	}

	public int getCode() {
		return this.code;
	}

	public String getTitel() {
		return this.titel;
	}

	public double getPreis() {
		return this.preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getKommentar() {
		return this.kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public void druckeInfo() {
		System.out.println("Code: " + this.code);
		System.out.println("Titel: " + this.titel);
		System.out.println("Preis: " + this.preis + " Euro");
		System.out.println("Kommentar: " + this.kommentar);
		System.out.println();
	}
}