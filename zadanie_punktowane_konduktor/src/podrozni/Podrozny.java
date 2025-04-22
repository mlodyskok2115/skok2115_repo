package podrozni;

import java.util.List;
import java.util.Random;

import systembiletowania.Bilet;
import systembiletowania.SystemSprzedazyBiletow;

public class Podrozny implements Comparable<Podrozny>{
	private static Random rand = new Random();
	private static final List<String> IMIONA = List.of("Tomasz","Marek","Pawel","Piotr","Jakub","Marcin","Mateusz","Andrzej","Alfred","Mikolaj");
	private static final List<String> NAZWISKA = List.of("Skok","Walczuk","Dolecki","Trzcinski","Barcinski","Ciupinski","Domitrz","Dmowski","Wilk","Melak");
	private String imie;
	private String nazwisko;
	private int stopienWyglodzenia;
	private Bilet bilet;
	
	public Podrozny(SystemSprzedazyBiletow system, String relacja) {
		this.imie = IMIONA.get(rand.nextInt(IMIONA.size()));
		this.nazwisko = NAZWISKA.get(rand.nextInt(NAZWISKA.size()));
		this.stopienWyglodzenia = rand.nextInt(10)+1;
		this.bilet = system.sprzedajBilet(imie,nazwisko,relacja);
	}
	
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public int getStopienWyglodzenia() {
		return stopienWyglodzenia;
	}
	public int compareTo(Podrozny inny) {
	    return Integer.compare(inny.stopienWyglodzenia, this.stopienWyglodzenia);
	}
	public Bilet getBilet() {
		return bilet;
	}
    public String toString() {
        return imie + " " + nazwisko;
    }
    public void zmienBilet(Bilet bilet) {
    	this.bilet = bilet;
    }
}

	
	

