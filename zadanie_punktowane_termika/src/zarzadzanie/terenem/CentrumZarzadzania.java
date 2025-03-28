package zarzadzanie.terenem;

import java.util.Random;
import teren.*;

public class CentrumZarzadzania {
	private Teren [][] mapa;
	private Random rand = new Random();
	
	public CentrumZarzadzania(int wiersze, int kolumny) {
		if (wiersze<=0)
			wiersze = 100;
		if (kolumny<=0)
			kolumny = 100;
		this.mapa = new Teren[wiersze][kolumny];
		for(int i=0; i<wiersze; i++) {
			for(int j=0; j<kolumny; j++) {
				int losowyTeren = rand.nextInt(5);
				if (losowyTeren == 0)
					mapa[i][j] = new Piasek();
				if (losowyTeren == 1)
					mapa[i][j] = new GlebaNieKamienista();
				if (losowyTeren == 2)
					mapa[i][j] = new GlebaKamienista();
				if (losowyTeren == 3)
					mapa[i][j] = new PodmoklaLaka();
				if (losowyTeren == 4)
					mapa[i][j] = new TerenWodny();
			}
		}
		
	}
	public void modyfikujAtmosfere() {
		for(int i=0; i<mapa.length;i++) {
			for(int j=0; j<mapa[0].length;j++) {
				int zmianaTemperatury = rand.nextInt(5)-1;
				mapa[i][j].modyfikujTemperature(zmianaTemperatury);
			}
		}
	}
	public Teren[][] getMapa() {
		return mapa;
	}
}
