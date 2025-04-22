package wagon;

import java.util.LinkedList;
import java.util.List;

import kasownik.Kasownik;
import podrozni.Podrozny;
import systembiletowania.Bilet;

public class Konduktor {
	private Kasownik kasownik;
	private Wagon wagon;
	private List<Podrozny> niewazneBilety = new LinkedList<>();
	
	public Konduktor(Wagon wagon, Kasownik kasownik) {
        this.wagon = wagon;
        this.kasownik = kasownik;
    }
	public void go() {
		for (String stolik : wagon.getNazwyStolikow()) {
			for (Podrozny podrozny : wagon.getPasazerowiePrzyStoliku(stolik)) {
				Bilet bilet = podrozny.getBilet();
				if(!kasownik.walidujBilet(bilet)) {
					System.out.println("NIEWAŻNY BILET: " + podrozny);
					niewazneBilety.add(podrozny);
					wagon.usunPasazera(podrozny);
				}
			}	
		}
		System.out.println("Ilość nieważnych biletów: " + niewazneBilety.size());
	}
	
	
	
	
	
}
