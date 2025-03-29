package adit;

import java.util.Random;

import gornik.Gornik;

public class TestAdit {
	public void main(String[] args) {
		Random rand = new Random();
		Adit adit = new Adit(2,7,4);
		System.out.println(adit);
		Gornik gornik = new Gornik(adit);
		gornik.goMiner();
		System.out.println(gornik.getIncome());
	}
}
