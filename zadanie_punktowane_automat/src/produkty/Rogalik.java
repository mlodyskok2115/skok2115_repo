package produkty;

public class Rogalik extends Jedzenie {

	public Rogalik() {
		super();
		this.zawartoscCukru = rand.nextInt(15)+15;
	}
	
	public int getMasa() {
		return masa;
	}
	
	@Override
	public int hashCode() {
		int wynik = 7;
		wynik = 31 * wynik + masa;
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
		Rogalik other = (Rogalik) obj;
		return (masa == other.masa && zawartoscCukru == other.zawartoscCukru);
	}
}
