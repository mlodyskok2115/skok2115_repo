package szybowce;

import teren.*;
import zarzadzanie.terenem.*;

public abstract class Szybowce {
	protected double aktualnaWysokosc;
	protected CentrumZarzadzania mapa;
	protected int pozycjaWiersz; // wiersz macierzy z którego zaczyna
	protected int pozycjaKolumna = 0;
	
	public Szybowce(double wysokoscPoczatkowa, CentrumZarzadzania mapa, int pozycjaPoczatkowa) {
		this.mapa = mapa;
		this.aktualnaWysokosc = wysokoscPoczatkowa;
		this.pozycjaWiersz = pozycjaPoczatkowa;
	}
	public abstract void fly();
}
