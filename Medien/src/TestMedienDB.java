// Datei: Medien/TestMedienDB.java
public class TestMedienDB {

	public static void main(String[] args) {
		Datenbank db = new Datenbank();
		db.erfasseMedium(new Medium("Herr der Ringe", 11.00));
		db.erfasseMedium(new Buch("Sprechen Sie Java",
				"Hanspeter Moessenboeck", "dpunkt.verlag", 2001, 28.00));
		db.erfasseMedium(new Cd("No Angel", "Dido", 13, 90, 15.00));
		db.erfasseMedium(new Video("X−Men", "Bryan Singer", 100, 21.00));
		db.auflisten();
	}

}