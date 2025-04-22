package kasownik;

import java.util.Random;

import systembiletowania.Bilet;
import systembiletowania.SystemSprzedazyBiletow;

public class KasownikOnline implements Kasownik {

	private SystemSprzedazyBiletow system;
	private Random rand = new Random();
	private String komunikat;
	
	public KasownikOnline(SystemSprzedazyBiletow system, String komunikat) {
		this.system = system;
		this.komunikat = komunikat;
	}
	public boolean walidujBilet(Bilet bilet) {
		if (rand.nextInt(100)<2) {
			System.out.println("Brak zasięgu! Walidacja niemożliwa.");
            return true;
		}
		boolean wynik = system.zweryfikujBilet(bilet);
		if (!wynik) System.out.println(komunikat);
		return wynik;

	}

}
