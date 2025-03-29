package obiektykopalniane;

public class Uraninit extends Radioaktywne {
	public enum Forma {URANOFAN, TORBERNIT, FOURMARIERYT};
	private Forma forma;
	public Uraninit(int bazowaWartosc) {
		super(bazowaWartosc);
		this.forma = Forma.values()[rand.nextInt(Forma.values().length)];
	}
	public Forma getForma() {
		return forma;
	}
	@Override
	public String toString() {
		return "Uraninit []";
	}

	@Override
	public double getModifiedMarketValue() {
		if (forma == Forma.values()[0])
			return bazowaWartosc;
		if (forma == Forma.values()[1])
			return 1.5 * (float) bazowaWartosc;
		if (forma == Forma.values()[2])
			return 2.5 * bazowaWartosc;
		return 0;
		
	}
}
