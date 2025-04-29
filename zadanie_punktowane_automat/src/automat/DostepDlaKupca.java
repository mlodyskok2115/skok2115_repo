package automat;

import java.util.List;

import produkty.Produkt;

public interface DostepDlaKupca {
	boolean randomOrder();
	List<Produkt> getAll();
}
