package konsument;

import grzyby.*;
import las.*;

public class Konsument {
	private Las las;
	
	public Konsument(Las las) {
		this.las = las;
	}
	public void konsumujGrzyby() {
		for (int i=0;i<20;i++) {
			Grzyby wybranyGrzyb = las.zwrocGrzyba();
			if (wybranyGrzyb != null) {
			wybranyGrzyb.ugotuj();
			if (zjedz(wybranyGrzyb)==true) {
				break;}
			}
		}
	}
	public boolean zjedz(Grzyby wybranyGrzyb) {
		if (wybranyGrzyb.isTrujacy() == true) {
			System.out.println("UUUUps!");
			return true;}
			else
				return false;
					
		
	}
	
	
}
