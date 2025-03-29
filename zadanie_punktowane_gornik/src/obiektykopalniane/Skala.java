package obiektykopalniane;

public class Skala extends Obiekt {
	
	public Skala() {
		this.bazowaWartosc = 1;
	}

	@Override
	public String toString() {
		return "Skala []";
	}

	@Override
	public double getModifiedMarketValue() {
		return bazowaWartosc;
	}
	
}
