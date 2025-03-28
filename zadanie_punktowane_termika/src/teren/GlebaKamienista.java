package teren;

import java.util.Random;

public class GlebaKamienista extends Gleby {
	private Random rand = new Random();
	private float gestosc;
	private static int gestoscMinimalna = 1;
	
	public GlebaKamienista() {
		this.temperatura = rand.nextInt(60)-20;
		this.gestosc = Math.round((rand.nextFloat((float) 1)+1)*100)/100f;
	}
	public double getPradyNoszace() {
		return 0.66 * (temperatura/8);
	}
	@Override
	public String toString() {
		return "GlebaKamienista";
	}
	
}
