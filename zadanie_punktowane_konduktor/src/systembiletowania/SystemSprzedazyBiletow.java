package systembiletowania;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SystemSprzedazyBiletow {
	private static Random rand = new Random();
	private final List<String> dostepneStoliki = List.of("Stolik1","Stolik2","Stolik3","Stolik4","Stolik5","Stolik6","Stolik7","Stolik8");
	private Set<Bilet> sprzedaneBilety = new LinkedHashSet<>();
	
	public Bilet sprzedajBilet(String imie, String nazwisko, String relacja) {
		String stolik = dostepneStoliki.get(rand.nextInt(dostepneStoliki.size()));
		Bilet bilet = new Bilet(imie, nazwisko, relacja, stolik);
		sprzedaneBilety.add(bilet);
		return bilet;
	}
	public boolean zweryfikujBilet(Bilet bilet) {
		if (sprzedaneBilety.contains(bilet)) {
			bilet.skasujBilet();
			return true;
		}
		else {
			return false;
		}
	}
	public Set<Bilet> getSprzedaneBilety() {
		return sprzedaneBilety;
	}
	
	
}
