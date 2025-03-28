package teren;

import java.util.Random;

public class GlebaNieKamienista extends Gleby {
	private Random rand = new Random();
	private float gestosc;
	
	public GlebaNieKamienista() {
		this.temperatura = rand.nextInt(60)-20;
		this.gestosc = Math.round((rand.nextFloat((float) 0.5)+1)*100)/100f;
	}
	public double getPradyNoszace() {
		return 0.66 * (temperatura/8);
	}
	@Override
	public String toString() {
		return "GlebaNiekamienista";
	}
	
}
