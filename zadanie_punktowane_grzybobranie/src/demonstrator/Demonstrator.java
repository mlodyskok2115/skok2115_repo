package demonstrator;

import konsument.*;
import las.*;

public class Demonstrator {
	public void main(String[] args) {
		Las las = new Las(10,10);
		Konsument maciek = new Konsument(las);
		maciek.konsumujGrzyby();
	}
}

