package gornik;

import obiektykopalniane.*;
import adit.*;

public class Gornik {
	private int income;
	private Adit adit;
	
	public Gornik(Adit adit) {
		this.income = 0;
		this.adit = adit;
	}
	public void goMiner() {
		for (int i=0; i<adit.getMapa().length; i++) {
			if (adit.getMapa()[i] != null) {
				for (int j=0;j<adit.getMapa()[i].length;j++) {
					income += adit.getMapa()[i][j].getModifiedMarketValue();
					adit.getMapa()[i][j] = null;
				}
			}
		
		}
	}
	public int getIncome() {
		return income;
	}
}
