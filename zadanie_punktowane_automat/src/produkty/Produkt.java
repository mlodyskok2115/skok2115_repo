package produkty;

import java.util.Random;

public abstract class Produkt implements Comparable<Produkt> {
	protected int zawartoscCukru;
	protected static Random rand = new Random();
	
	public int getZawartoscCukru() {
		return zawartoscCukru;
	}
	
	public int compareTo(Produkt inny) {
		return Integer.compare(this.zawartoscCukru,inny.zawartoscCukru);
	}
	public abstract int getMasa();
}
