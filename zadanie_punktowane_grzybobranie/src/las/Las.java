package las;

import java.util.Random;
import grzyby.*;

public class Las {
	private static Random rand = new Random();
	private Grzyby[][] mapa;
	
	public Las(int wiersze, int kolumny) {
		if (wiersze<=0 || kolumny <= 0)
			wiersze = 100;
		this.mapa = new Grzyby[wiersze][kolumny];
		int pustaKolumna = rand.nextInt(kolumny);
		for (int i=0;i<wiersze;i++) {
			for (int j=0;j<kolumny;j++) {
				if (j != pustaKolumna) {
					int czyGrzyb = rand.nextInt(5);
					if (czyGrzyb == 0) {
						int jakiGrzyb = rand.nextInt(4);
						if (jakiGrzyb == 0)
							mapa[i][j] = new Sromotnikowy();
						if (jakiGrzyb == 1)
							mapa[i][j] = new Cesarski();
						if (jakiGrzyb == 2)
							mapa[i][j] = new Kolczastoglowy();
						if (jakiGrzyb == 3)
							mapa[i][j] = new Szarawy();
					}
					
				}
			}
		}
	}
	public Grzyby[][] getMapa(){
		return mapa;
	}
	public Grzyby zwrocGrzyba() {
		int wiersz = rand.nextInt(mapa.length);
		int kolumna = rand.nextInt(mapa[0].length);
		return mapa[wiersz][kolumna];
	}
}
