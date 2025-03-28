package teren;

public abstract class Teren {
	
	protected int temperatura;

	public int getTemperatura() {
		return temperatura;
	}	
	public abstract void modyfikujTemperature(int deltaT);
	
	public abstract double getPradyNoszace();
}