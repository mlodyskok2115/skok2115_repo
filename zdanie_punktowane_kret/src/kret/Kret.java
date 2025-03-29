package kret;

import srodowisko.*;
import java.util.Random;
import obiektyziemne.*;

public class Kret implements RuchKreta  {
	public enum Gatunek {CINEREA,EUROPAEA,VELESSIENSIS};
	private Gatunek gatunek;
	private int wartoscOdzywcza;
	private Obiekty[][] mapa;
	private Random rand = new Random();
	
	public Kret(Gatunek gatunek, Obiekty[][] mapa) {
		this.gatunek = gatunek;
		this.mapa = mapa;
		this.wartoscOdzywcza = rand.nextInt(40)+200;
	}
	@Override
	public void idzKret() {
		int x = rand.nextInt(mapa.length);
		int y = rand.nextInt(mapa[0].length);
		if (mapa[x][y] == null || mapa[x][y] instanceof Gleba) {
			System.out.println("Pusto");}
			else {
			wartoscOdzywcza += mapa[x][y].getWartoscOdzywcza();
			System.out.println("Mniam!");
			mapa[x][y] = null;
			}	
	}
	@Override
	public int getWartoscOdzywcza() {
		return wartoscOdzywcza;
	}

}
