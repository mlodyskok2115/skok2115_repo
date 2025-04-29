package demonstrator;

import produkty.*;

public class Demonstrator {
	
	public static void main(String[] args) {
		Baton baton1 = new Baton();
		Baton baton2 = new Baton();
		Napoj napoj1 = new Napoj();
		Napoj napoj2 = new Napoj();
		
		System.out.println(baton2.hashCode());
		System.out.println(baton1.hashCode());
		
		
	}
	
}
