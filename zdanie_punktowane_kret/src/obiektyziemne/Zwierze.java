package obiektyziemne;

public abstract class Zwierze extends Obiekty {
	protected double masa;
	
	public Zwierze(int wartoscOdzywcza) {
		super(wartoscOdzywcza);
	}
	public double getMasa() {
		return masa;
	}
}
