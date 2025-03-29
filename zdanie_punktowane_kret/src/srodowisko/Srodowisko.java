package srodowisko;

import java.util.Random;
import kret.*;
import kret.Kret.Gatunek;
import obiektyziemne.*;

public class Srodowisko {
	private Obiekty[][] mapa;
	private static int wartoscOdzywczaDzdzownicy = 3;
	private Random rand = new Random();
	private RuchKreta ruchKreta = null;
	
	public Srodowisko(int wiersze, int kolumny, int iloscLarw, int iloscDzdzownic) {
		Obiekty[][] mapa = new Obiekty[wiersze][kolumny];
		for (int i=0;i<wiersze;i++) {
			for (int j=0;j<kolumny;j++) {
				mapa[i][j] = new Gleba(0);}}
		
		for (int k=0;k<iloscLarw;k++) {
			int x = rand.nextInt(wiersze);
			int y = rand.nextInt(kolumny);
			mapa[x][y] = new Larwa(rand.nextInt(3)+3);}
		
		for (int l=0;l<iloscDzdzownic;l++) {
			boolean wolneMiejsce = true;
			while (wolneMiejsce == true) {
				int x = rand.nextInt(wiersze);
				int y = rand.nextInt(kolumny);
				if (!(mapa[x][y] instanceof Larwa)) {
					mapa[x][y] = new Dzdzownica(wartoscOdzywczaDzdzownicy);
					wolneMiejsce = false;}}}
		this.mapa = mapa;		
	}
	public Srodowisko(int wiersze, int kolumny, int iloscLarw, int iloscDzdzownic, Gatunek europaea) {
		this(wiersze,kolumny,iloscLarw,iloscDzdzownic);
		this.ruchKreta = new Kret(europaea,mapa);
		
	}
	public void biegnijKret() {
		if (ruchKreta == null) {
            System.out.println("Brak kreta w środowisku!");
            return;
        }
		for (int i=0;i<10;i++)
			ruchKreta.idzKret();
	}

	public Obiekty[][] getMapa() {
		return mapa;
	}
	
	public String pokazMape() {
		String zwraca ="";
		for (int i=0; i < mapa.length;i++) {
			for (int j=0;j < mapa[0].length;j++) {
				if (mapa[i][j] instanceof Gleba)
					zwraca += "#";
				if (mapa[i][j] instanceof Larwa)
					zwraca += "{}";
				if (mapa[i][j] instanceof Dzdzownica)
					zwraca += "@";}
			zwraca += "\n";}
		return zwraca;
	}
	
}
