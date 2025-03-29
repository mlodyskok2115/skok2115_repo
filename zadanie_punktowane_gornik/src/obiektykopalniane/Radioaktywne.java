package obiektykopalniane;

public abstract class Radioaktywne extends Obiekt {
	protected int radioaktywnosc;
	
	public Radioaktywne(int bazowaWartosc) {
		this.bazowaWartosc = bazowaWartosc;
		this.radioaktywnosc = rand.nextInt(251)+700;
	}
	public int getRadioaktywnosc() {
		return radioaktywnosc;
	}
	@Override
	public abstract double getModifiedMarketValue();


}
