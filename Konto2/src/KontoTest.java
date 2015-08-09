//Datei: Konto2/KontoTest.java
//Beispiel : Datenkapselung
public class KontoTest {
	public static void main(String[] args) {
		Konto meinKonto = new Konto();
		/*
		 * meinKonto.kontonummer = 4531088; !! Fehler
		 * System.out.println(meinKonto.kontonummer); !! Fehler
		 */
		meinKonto.setKontonummer(4531088); // schreibender Zugri auf Attribute
											// ueber entsprechende Methoden
		meinKonto.setSaldo(200.00);
		System.out.print("Kontonummer: " + meinKonto.getKontonummer()); // lesender
																		// Zugri
		System.out.println(" Saldo: " + meinKonto.getSaldo() + " Euro");
	}
}