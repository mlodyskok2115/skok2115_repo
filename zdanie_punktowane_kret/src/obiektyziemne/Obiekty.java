package obiektyziemne;

import java.util.Random;

public abstract class Obiekty {
	protected int wartoscOdzywcza;
	protected static Random rand = new Random();
	
	public Obiekty(int wartoscOdzywcza) {
		this.wartoscOdzywcza = wartoscOdzywcza;
	}
	public int getWartoscOdzywcza() {
		return wartoscOdzywcza;
	}
	
}
