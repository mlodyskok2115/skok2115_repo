package demonstrator;

import podrozni.*;
import systembiletowania.Bilet;
import systembiletowania.SystemSprzedazyBiletow;
import wagon.Konduktor;
import wagon.Wagon;

import java.util.ArrayList; 
import java.util.List;

import kasownik.KasownikOffline;
import kasownik.KasownikOnline;

public class Demonstrator {

	public static void main(String[] args) {
		SystemSprzedazyBiletow system = new SystemSprzedazyBiletow();
        List<Podrozny> podrozni = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            podrozni.add(new Podrozny(system, "WARSZAWA-ZAKOPANE"));
        }
        
        Bilet falszywyBilet = new Bilet("Marek","Smok","WARSZAWA-ZAKOPANE","Stolik5");
        podrozni.get(5).zmienBilet(falszywyBilet);
        
        Wagon wagon = new Wagon(podrozni);
        KasownikOffline kasownikOffline = new KasownikOffline(system);
        kasownikOffline.wgrajInformacjeOSprzedanychBiletach();

        KasownikOnline kasownikOnline = new KasownikOnline(system,  "To jest szwindel!");

        Konduktor konduktor = new Konduktor(wagon, kasownikOffline);
        konduktor.go();
    }
	
}
