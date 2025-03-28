package szybowce;

import java.util.Random;

import teren.Teren;
import zarzadzanie.terenem.CentrumZarzadzania;

public class Jantar_2 extends Szybowce {

	private Random rand = new Random();
	
	public Jantar_2(double wysokoscPoczatkowa, CentrumZarzadzania mapa, int pozycjaPoczatkowa) {
		super(wysokoscPoczatkowa, mapa, pozycjaPoczatkowa);
	}
	
	
	public void fly() {
		if (aktualnaWysokosc != 0) {
			pozycjaKolumna += 1;
			int skret = rand.nextInt(3);
			if (skret == 1)
				pozycjaWiersz -= 1;
			if (skret == 2)
				pozycjaWiersz += 1;
			if (pozycjaKolumna > mapa.getMapa()[0].length-1 || pozycjaWiersz > mapa.getMapa().length-1 || pozycjaWiersz < 0) {
				System.out.println("Lot poza strefą");
				aktualnaWysokosc = 0;}
				else if (aktualnaWysokosc - mapa.getMapa()[pozycjaWiersz][pozycjaKolumna].getPradyNoszace() <= 0) {
					System.out.println("Ooops lądowanie w polu");
					aktualnaWysokosc = 0;}
					else
						aktualnaWysokosc -= mapa.getMapa()[pozycjaWiersz][pozycjaKolumna].getPradyNoszace();
						System.out.println("Aktualna wysokość: "+aktualnaWysokosc);
		}				
	}


	@Override
	public String toString() {
		return "Jantar_2 [aktualnaWysokosc=" + aktualnaWysokosc + "]";
	}
	
}

