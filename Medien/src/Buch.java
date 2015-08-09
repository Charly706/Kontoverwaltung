// Datei: Medien/Buch.java
public class Buch extends Medium {
	protected String autor;
	protected String verlag;
	protected int erscheinungsjahr;

	public Buch(String titel, String autor, String verlag, int jahr,
			double preis) {
		super(titel, preis);
		this.autor = autor;
		this.verlag = verlag;
		this.erscheinungsjahr = jahr;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getVerlag() {
		return this.verlag;
	}

	public int getErscheinungsjahr() {
		return this.erscheinungsjahr;
	}

	@Override
	public void druckeInfo() {
		System.out.println("Code: " + this.code);
		System.out.println("Titel: " + this.titel);
		System.out.println("Autor: " + this.autor);
		System.out.println("Verlag: " + this.verlag + ", "
				+ this.erscheinungsjahr);
		System.out.println("Preis: " + this.preis + " Euro");
		System.out.println("Kommentar: " + this.kommentar);
		System.out.println();
	}
}