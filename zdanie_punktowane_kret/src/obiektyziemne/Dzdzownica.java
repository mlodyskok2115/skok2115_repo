package obiektyziemne;

public class Dzdzownica extends Zwierze {
	
	public Dzdzownica(int wartoscOdzywcza) {
		super(wartoscOdzywcza);
		this.masa = rand.nextDouble(0.5)+0.5;
	}
}
