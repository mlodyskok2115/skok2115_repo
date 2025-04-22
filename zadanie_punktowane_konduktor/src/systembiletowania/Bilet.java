package systembiletowania;

public class Bilet {
	private String imie;
	private String nazwisko;
	private String relacjaPociagu;
	private String nazwaStolika;
	private boolean skasowany=false;
	private int kodBiletu;
	
	public Bilet(String imie, String nazwisko, String relacja, String stolik) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.relacjaPociagu = relacja;
		this.nazwaStolika = stolik;
		this.kodBiletu = (imie + nazwisko).hashCode();
	}
	public String getRelacjaPociagu() {return relacjaPociagu;}
	public String getNazwaStolika() {return nazwaStolika;}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Bilet)) return false;
		Bilet bilet = (Bilet) o;
		
		if (relacjaPociagu == bilet.getRelacjaPociagu() && nazwaStolika == bilet.getNazwaStolika()) return true;
			else return false;
	}
	public void skasujBilet() {
		skasowany = true;
	}
	
	
}
