package automat;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import produkty.Jedzenie;
import produkty.Napoj;
import produkty.Produkt;

public class Automat implements DostepDlaSerwisanta{
	private Set<Jedzenie> pulkaJedzenie = new HashSet<>();
	private Set<Napoj> pulkaNapoje = new LinkedHashSet<>();
	private final Deque<Produkt> podajnik = new ArrayDeque<>();
	private Random rand = new Random();
	
	@Override
	public boolean randomOrder() {
		List<Produkt> wszystko = new ArrayList<>();
		wszystko.addAll(pulkaJedzenie);
	    wszystko.addAll(pulkaNapoje);
	    
		if (wszystko.isEmpty()) {
			System.out.println("Brak Towaru!");
			return false;
		}
		Produkt losowy = wszystko.get(rand.nextInt(wszystko.size()));
		
		if (losowy instanceof Napoj) {
			pulkaNapoje.remove(losowy);
			podajnik.addLast(losowy);
			return true;
		}
		else {
			pulkaJedzenie.remove(losowy);
			podajnik.addLast(losowy);
			return true;
		}
	}
	@Override
	public List<Produkt> getAll() {
		List<Produkt> posortowane = new ArrayList<Produkt>(podajnik);
		podajnik.clear();
		posortowane.sort(null);
		return posortowane;
	}
	@Override
	public boolean put(Jedzenie jedzenie) {
		if (pulkaJedzenie.size() >= 15) return false;
		if (jedzenie.getZawartoscCukru() > 99 || jedzenie.getZawartoscCukru()<0) {
			throw new IllegalArgumentException("Nieakceptowalna zawartość cukru.");
		}
		pulkaJedzenie.add(jedzenie);
		return true;
	}
	@Override
	public boolean putNapoj(Napoj napoj) {
		if (pulkaNapoje.size() >= 10) return false;
		if (napoj.getZawartoscCukru() > 99 || napoj.getZawartoscCukru()<0) {
			throw new IllegalArgumentException("Nieakceptowalna zawartość cukru.");
		}
		pulkaNapoje.add(napoj);
		return true;
	}
	
	public int getPulkaJedzenieSize() {
		return pulkaJedzenie.size();
	}
	public int getPulkaNapojeSize() {
		return pulkaNapoje.size();
	}
	
	
	
	
}
