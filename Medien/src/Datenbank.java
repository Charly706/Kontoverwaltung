// Datei: Medien/Datenbank.java
import java.util.Vector;

public class Datenbank {
	private Vector<Medium> medien;

	public Datenbank() {
		this.medien = new Vector<Medium>();
	}

	public void erfasseMedium(Medium med) {
		this.medien.add(med);
	}

	public void auflisten() {
		Medium med;
		for (int i = 0; i < medien.size(); i++) {
			med = this.medien.get(i);
			med.druckeInfo();
		}
	}
}