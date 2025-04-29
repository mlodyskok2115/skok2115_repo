package produkty;

public abstract class Jedzenie extends Produkt {
	protected int masa;
	
	public Jedzenie() {
		this.masa = rand.nextInt(30) + 20;
	}
	public double getSugarContent() {
		return (masa * zawartoscCukru)/100;
	}
	@Override
	public abstract int getMasa();

	
}
