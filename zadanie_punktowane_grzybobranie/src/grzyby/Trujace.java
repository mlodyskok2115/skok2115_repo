package grzyby;

public class Trujace extends Grzyby {
	public enum Toksyny {WYJATKOWO_ZABOJCZE,ZABOJCZE,TRUJACE,NIEOBECNE}
	protected Toksyny toksyny;
	public Trujace() {
		this.masa =  rand.nextDouble(50)+25;
		this.twardosc = Twardosc.values()[rand.nextInt(Twardosc.values().length)];
	}
	public Toksyny getToksyny() {
		return toksyny;
	}
	public void ugotuj() {
		if (toksyny == Toksyny.values()[2]) {
			twardosc = Twardosc.values()[1];
			toksyny = Toksyny.values()[3];}
			else 
				twardosc = Twardosc.values()[1];
		}
	public boolean isTrujacy() {
		if (toksyny == Toksyny.values()[0] || toksyny == Toksyny.values()[1] || toksyny == Toksyny.values()[2]) {
			return true;}
			else {
				return false;
		}
	}
}

