package grzyby;

public class Sromotnikowy extends Trujace {
	public Sromotnikowy() {
		super();
		if (masa <50) {
			this.toksyny = Toksyny.values()[1];}
			else
				this.toksyny = Toksyny.values()[0];	
	}
	@Override
	public String toString() {
		return "Sromotnikowy [toksyny=" + toksyny + ", twardosc=" + twardosc + ", masa=" + masa + "]";
	}
}
