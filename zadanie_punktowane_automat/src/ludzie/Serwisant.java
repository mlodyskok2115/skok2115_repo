package ludzie;

import java.util.List;
import java.util.Random;

import automat.DostepDlaSerwisanta;
import produkty.Baton;
import produkty.Napoj;
import produkty.Produkt;
import produkty.Rogalik;

public class Serwisant {
	private DostepDlaSerwisanta automat;
	private static Random rand = new Random();
	
	public Serwisant(DostepDlaSerwisanta automat) {
		this.automat = automat;
	}
	
	public void doJob() {
		int flagaJedzenie = 1;
		int flagaNapoi = 1;
		while (flagaJedzenie == 1 || flagaNapoi == 1) {
			int losuj = rand.nextInt(3);
			if (losuj == 0) {
				Baton baton = new Baton();
				automat.put(baton);}
			if (losuj == 1) {
				Rogalik rogalik = new Rogalik();
				automat.put(rogalik);}
			if (losuj == 2) {
				Napoj napoj = new Napoj();
				automat.putNapoj(napoj);}
			if (automat.getPulkaJedzenieSize() == 15) {
				flagaJedzenie = 0;
			}
			if (automat.getPulkaNapojeSize() == 10) {
				flagaNapoi = 0;
			}
		}
		automat.randomOrder();
		List<Produkt> zakupione = automat.getAll();

	    if (zakupione.isEmpty()) {
	        System.out.println("Nie udało się kupić produktu.");
	    } else {
	        System.out.println("Serwisant wyjął z podajnika: " + zakupione.get(0));
	    }
	
	}
	
	
}
