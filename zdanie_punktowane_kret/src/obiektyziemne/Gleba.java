package obiektyziemne;

public class Gleba extends Obiekty {
	private double gestosc;
	
	public Gleba(int wartoscOdzywcza) {
		super(wartoscOdzywcza);
		this.gestosc = rand.nextDouble(1)+1.4;
	}
	public double getGestosc() {
		return gestosc;
	}
}
