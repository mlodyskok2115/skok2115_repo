package grzyby;

public class Cesarski extends Grzyby {
	public Cesarski() {
		this.masa = rand.nextDouble(50)+25;
		this.twardosc = Twardosc.values()[0];
	}
	public void ugotuj() {
		twardosc = Twardosc.values()[1];
		}
	@Override
	public String toString() {
		return "Cesarski [twardosc=" + twardosc + ", masa=" + masa + "]";
	}
	public boolean isTrujacy() {
		return false;
	}
}
