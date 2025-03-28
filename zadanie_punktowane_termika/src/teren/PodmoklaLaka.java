package teren;

import java.util.Random;

public class PodmoklaLaka extends Teren {
	private Random rand = new Random();
	private boolean spelniaWymogiNatura2000;
	
	public PodmoklaLaka() {
		this.temperatura = rand.nextInt(40)-20;
		this.spelniaWymogiNatura2000 = rand.nextBoolean();
	}
	public boolean getSpelniaWymogiNatura2000() {
		return spelniaWymogiNatura2000;
	}
	public double getPradyNoszace() {
		return (temperatura/10) - rand.nextDouble(3)+1;
	}
	public void modyfikujTemperature(int deltaT) {
		if (deltaT < -20 || deltaT > 50)
			throw new IllegalArgumentException("Temperatura poza dozwolonym zakresem");
		if (temperatura + deltaT > 20)
			temperatura = 20;
			else if (temperatura + deltaT < -20)
				temperatura = -20;
				else 
					temperatura = temperatura + deltaT;
	}
	@Override
	public String toString() {
		return "PodmoklaLaka";
	}
	
}
