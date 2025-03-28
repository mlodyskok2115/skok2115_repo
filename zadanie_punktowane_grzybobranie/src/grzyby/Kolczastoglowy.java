package grzyby;

public class Kolczastoglowy extends Grzyby {
	
	public Kolczastoglowy() {
		this.masa = rand.nextDouble(25)+25;
		this.twardosc = Twardosc.values()[rand.nextInt(Twardosc.values().length)];
	}
	public void ugotuj() {
		twardosc = Twardosc.values()[1];
		}
	@Override
	public String toString() {
		return "Kolczastoglowy [twardosc=" + twardosc + ", masa=" + masa + "]";
	}
	public boolean isTrujacy() {
		return false;
	}	
}
