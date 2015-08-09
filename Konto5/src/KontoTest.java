//Datei: Konto5/Konto.java
//Beispiel : Manipulierbarkeit
public class KontoTest {
	static void ueberweisen(double betrag, Konto kontoA, Konto kontoZ) {
		kontoA.auszug();
		kontoZ.auszug();
		kontoA.auszahlen(betrag);
		kontoZ.einzahlen(betrag);
		System.out.print("Von Konto " + kontoA.getKontonummer());
		System.out.print(" wurden " + betrag + " Euro ");
		System.out.println("auf Konto " + kontoZ.getKontonummer()
				+ " ueberwiesen.");
		kontoA.auszug();
		kontoZ.auszug();
	}

	public static void main(String[] args) {
		Konto meinKonto = new Konto(4531088);
		meinKonto.einzahlen(300.00);
		Konto deinKonto = new Konto(4531088);
		deinKonto.einzahlen(300.00);
		Konto unserKonto;
		// Zuweisung
		unserKonto = deinKonto;
		// Vergleich
		if (meinKonto == deinKonto)
			System.out.println("Mein Konto und dein Konto sind identisch.");
		else
			System.out.println("Mein Konto und dein Konto sind verschieden.");
		if (unserKonto == deinKonto)
			System.out.println("Unser Konto und dein Konto sind identisch.");
		else
			System.out.println("Unser Konto und dein Konto sind verschieden.");
		// Parameter
		ueberweisen(30.00, meinKonto, deinKonto);
	}
}