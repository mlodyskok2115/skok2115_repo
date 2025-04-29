package ludzie;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import automat.DostepDlaKupca;
import produkty.Baton;
import produkty.Produkt;
import produkty.Rogalik;

public class Kupiec {
	private static Random rand = new Random();
	private final int id;
	private DostepDlaKupca automat;
	
	public Kupiec(int id, DostepDlaKupca automat) {
		this.id = id;
		this.automat = automat;
	}
	public void doJob() {
		int ile = rand.nextInt(6)+5;
		for (int i=0;i<ile;i++) {
			automat.randomOrder();
		}
		List<Produkt> kupione = automat.getAll();
		int odebrane=0;
		int masa=0;
		
		for (Produkt produkt : kupione) {
			if (produkt instanceof Baton || produkt instanceof Rogalik) {
				masa += produkt.getMasa();
				odebrane+=1;
			}
		System.out.println("Średnia masa: " + masa/odebrane);
		}
	}
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kupiec other = (Kupiec) obj;
		return id == other.id;
	}

}
