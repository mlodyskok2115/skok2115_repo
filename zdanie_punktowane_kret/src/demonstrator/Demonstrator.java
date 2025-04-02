package demonstrator;

import kret.*;
import kret.Kret.Gatunek;
import obiektyziemne.*;
import srodowisko.*;

public class Demonstrator {
	public static void main(String[] args) {
		Srodowisko srodowisko = new Srodowisko(5,3,10,5,Gatunek.EUROPAEA);
		//System.out.println(srodowisko.pokazMape());
		srodowisko.biegnijKret();
	}
	
}
