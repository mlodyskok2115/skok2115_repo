package grzyby;

public class Szarawy extends Trujace {
	private static int rokOdkrycia = 1783;
	public Szarawy() {
		super();
		this.toksyny = Toksyny.values()[2];
	}
	@Override
	public String toString() {
		return "Szarawy [toksyny=" + toksyny + ", twardosc=" + twardosc + ", masa=" + masa + "]";
	}
	
}
