package obiektykopalniane;

public class Chalkolit extends Radioaktywne {

	public Chalkolit(int bazowaWartosc) {
		super(bazowaWartosc);
	}
	@Override
	public String toString() {
		return "Chalkolit []";
	}

	@Override
	public double getModifiedMarketValue() {
		return bazowaWartosc;
	}
	
}
