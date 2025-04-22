package kasownik;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import systembiletowania.Bilet;
import systembiletowania.SystemSprzedazyBiletow;

public class KasownikOffline implements Kasownik {

	private List<Bilet> sprzedaneBilety = new LinkedList<>();
	private Set<Bilet> sprawdzoneBilety = new HashSet<>();
	private SystemSprzedazyBiletow system;

	public KasownikOffline(SystemSprzedazyBiletow system) {
		this.system = system;
	}
	
	public boolean walidujBilet(Bilet bilet) {
		if (sprzedaneBilety.contains(bilet)) {
			sprzedaneBilety.remove(bilet);
			sprawdzoneBilety.add(bilet);
			return true;
		}
		return false;
	}
	public void wgrajInformacjeOSprzedanychBiletach() {
		sprzedaneBilety.clear();
		sprzedaneBilety.addAll(system.getSprzedaneBilety());
	}

}
