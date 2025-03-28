package grzyby;

import java.util.Random;

public abstract class Grzyby {
	protected static Random rand = new Random();
	public enum Twardosc {TWARDY, MIEKKI, SREDNIOTWARDY};
	protected Twardosc twardosc;
	protected double masa;
	public Twardosc getTwardosc() {
		return twardosc;
	}
	public double getMasa() {
		return masa;
	}
	public abstract void ugotuj();
	
	public abstract boolean isTrujacy();

	}

