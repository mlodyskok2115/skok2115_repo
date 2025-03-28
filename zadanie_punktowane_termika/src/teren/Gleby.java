package teren;

public abstract class Gleby extends Teren {
	private float gestosc;
	
	public void modyfikujTemperature(int deltaT) {
		if (deltaT < -20 || deltaT > 50)
			throw new IllegalArgumentException("Temperatura poza dozwolonym zakresem");
		if (temperatura + deltaT > 40)
			temperatura = 40;
			else if (temperatura + deltaT < -20)
				temperatura = -20;
				else 
					temperatura = temperatura + deltaT;
	}
	public float getGestosc() {
		return gestosc;
	}
	public abstract double getPradyNoszace();
		
}
		

