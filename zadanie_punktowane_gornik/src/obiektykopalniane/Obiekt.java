package obiektykopalniane;

import java.util.Random;

public abstract class Obiekt implements MineryObjectEvaluator {
	protected Random rand = new Random();
	protected int bazowaWartosc;
	
	public abstract double getModifiedMarketValue();

	
}
