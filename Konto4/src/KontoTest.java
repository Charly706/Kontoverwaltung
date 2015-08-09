// Datei: Konto4/KontoTest.java
// Beispiel : Klassenvariablen
public class KontoTest {
	public static void main(String[] args) {
		// Zugri auf Klassenvariablen ueber Klassennamen
		System.out.println("Anzahl Konten: " + Konto.zaehler);
		Konto meinKonto = new Konto(4531088);
		System.out.println("Anzahl Konten: " + Konto.zaehler);
		Konto deinKonto = new Konto(1733065);
		System.out.println("Anzahl Konten: " + Konto.zaehler);
	}
}