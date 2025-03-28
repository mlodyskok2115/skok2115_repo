package teren;

import java.util.Random;

public class Piasek extends Teren  {

	public enum Sypkosc { GRUBY, DROBNY, SREDNI };
	private Sypkosc sypkosc;
	private Random rand = new Random();
	
	public Piasek() {
		this.temperatura = rand.nextInt(70)-20;
		this.sypkosc = Sypkosc.values()[rand.nextInt(Sypkosc.values().length)];		
		}
	public Sypkosc getSypkosc() {
		return sypkosc;
	}
	public double getPradyNoszace() {
		return 0.2 * rand.nextDouble(1) * temperatura;
	}
	public void modyfikujTemperature(int deltaT) {
		if (deltaT < -20 || deltaT > 50)
			throw new IllegalArgumentException("Temperatura poza dozwolonym zakresem");
		if (temperatura + deltaT > 50)
			temperatura = 50;
			else if (temperatura + deltaT < -20)
				temperatura = -20;
				else 
					temperatura = temperatura + deltaT;
	}
	@Override
	public String toString() {
		return "Piasek";
	}
	
}
