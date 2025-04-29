package automat;

import produkty.Jedzenie;
import produkty.Napoj;
import produkty.Produkt;

public interface DostepDlaSerwisanta extends DostepDlaKupca {
	
	boolean put(Jedzenie jedzenie);
	boolean putNapoj(Napoj napoj);
	int getPulkaNapojeSize();
	int getPulkaJedzenieSize();

	
}
