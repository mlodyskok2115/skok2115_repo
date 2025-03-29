package adit;

import java.util.Arrays;
import java.util.Random;

import gornik.*;
import obiektykopalniane.*;

public class Adit {
	private Obiekt[][] mapa;
	private static Random rand = new Random();
	
	public Adit(int maksDystans, int dlugoscKorytarzy, int iloscKorytarzy) {
		int flaga = 1;
		int ileKorytarzyWstawiono = 0;
		int wierszNastepnegoKorytarza = 1;
		int dlugoscSzybu = maksDystans * (iloscKorytarzy + 1);
		Obiekt[][] mapa = new Obiekt[dlugoscSzybu][dlugoscKorytarzy];
		for (int i=0; i < dlugoscSzybu; i++) {
			if (ileKorytarzyWstawiono == iloscKorytarzy) {
				flaga = 0;}
			if (i == dlugoscSzybu-1 && ileKorytarzyWstawiono<iloscKorytarzy) {
				wierszNastepnegoKorytarza = i;
				}
			if (i != wierszNastepnegoKorytarza && flaga == 1) {
				wierszNastepnegoKorytarza = rand.nextInt(maksDystans)+ 1 + i;
				flaga = 0;
				}
			if (i == wierszNastepnegoKorytarza) {
				
				ileKorytarzyWstawiono += 1;
				for (int j=0; j < dlugoscKorytarzy; j++) {
					int losujObiekt = rand.nextInt(10);
					if (losujObiekt == 9)
						mapa[i][j] = new Uraninit(50);
					if (losujObiekt == 8 || losujObiekt == 7)
						mapa[i][j] = new Chalkolit(50);
					if (losujObiekt < 7)
						mapa[i][j] = new Skala();	}
				flaga = 1;}
			if (i != wierszNastepnegoKorytarza && flaga == 0){
					mapa[i] = null;
					}
			}
		this.mapa = mapa;
	}
	public Obiekt[][] getMapa() {
		return mapa;
	}
	@Override
	public String toString() {
		String zwracany = "Mapa:\n";
		for(int i = 0; i<mapa.length;i++) {
			if (mapa[i] == null) 
				zwracany += "null";
			if (mapa[i] != null) {
				zwracany += "--> ";
				for (int j=0; j<mapa[i].length;j++)
					zwracany += mapa[i][j].getModifiedMarketValue() + " ";}
			zwracany += "\n";}
		return zwracany;
	}
}
