package demonstrator;

import kret.*;
import kret.Kret.Gatunek;
import obiektyziemne.*;
import srodowisko.*;

public class Demonstrator {
	public void main(String[] args) {
		Srodowisko srodowisko = new Srodowisko(10,10,5,5,Gatunek.EUROPAEA);
		//System.out.println(srodowisko.pokazMape());
		srodowisko.biegnijKret();
	}
	
}
