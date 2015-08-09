// Datei: Medien/Video.java
public class Video extends Medium {
	protected String regisseur;
	protected int spieldauer;

	public Video(String titel, String reg, int zeit, double preis) {
		super(titel, preis);
		this.regisseur = reg;
		this.spieldauer = zeit;
	}

	public String getRegisseur() {
		return this.regisseur;
	}

	public int getSpieldauer() {
		return this.spieldauer;
	}

	@Override
	public void druckeInfo() {
		System.out.println("Code: " + this.code);
		System.out.println("Titel: " + this.titel);
		System.out.println("Regisseur: " + this.regisseur);
		System.out.println("Spieldauer: " + this.spieldauer + " min");
		System.out.println("Preis: " + this.preis + " Euro");
		System.out.println("Kommentar: " + this.kommentar);
		System.out.println();
	}
}