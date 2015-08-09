//Datei: Konto9/KontoTest.java
//Beispiel : Ueberladen
public class KontoTest {
	public static void main(String[] args) {
		Konto meinKonto = new Konto(4531088);
		meinKonto.einzahlen(300.00);
		meinKonto.auszug();
		Konto deinKonto = new Konto(1733065, 200.00);
		deinKonto.auszug();
		Sparkonto meinSparkonto = new Sparkonto(5613990, 1.25);
		meinSparkonto.einzahlen(600.00);
		meinSparkonto.auszug();
		Sparkonto deinSparkonto = new Sparkonto(7835406, 500.00, 1.3);
		deinSparkonto.auszug();
		Girokonto meinGirokonto = new Girokonto(2571183, 400.00);
		meinGirokonto.einzahlen(250.00);
		meinGirokonto.auszug();
		Girokonto deinGirokonto = new Girokonto(6464951, 600.00, 400.00);
		deinGirokonto.auszug();
	}
}