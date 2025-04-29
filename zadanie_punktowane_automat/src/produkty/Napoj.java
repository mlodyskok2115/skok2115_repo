package produkty;

import java.util.Objects;

public class Napoj extends Produkt {
	private int objetosc;
	private static double gestosc = 0.95;
	
	public Napoj() {
		this.objetosc = rand.nextInt(151) + 100; // 100–250 ml
		this.zawartoscCukru = rand.nextInt(5) + 8; // 8–12%
	}
	
	public double getSugarContent() {
		return (objetosc * gestosc * zawartoscCukru)/100;
	}
	@Override
	public int hashCode() {
		int wynik = 7;
		wynik = 31 * wynik + objetosc;
		wynik = 31 * wynik + zawartoscCukru;
		return wynik;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Napoj other = (Napoj) obj;
		return (objetosc == other.objetosc && zawartoscCukru == other.zawartoscCukru);
	}
	@Override
	public int getMasa() {
		return 0;
	}

}
