package Demonstrator;

import teren.*;
import zarzadzanie.terenem.*;
import szybowce.*;

public class Demonstrator {
	public static void main(String[] args) {
	CentrumZarzadzania mapa = new CentrumZarzadzania(100, 100);
	Bocian bocian = new Bocian(50,mapa,5);
	for (int i=0;i<100;i++) {
		bocian.fly();
		mapa.modyfikujAtmosfere();
		}	
	}
}
