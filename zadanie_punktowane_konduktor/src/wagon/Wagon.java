package wagon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import podrozni.*;
import systembiletowania.*;

public class Wagon {
	private Map<String, TreeSet<Podrozny>> stoliki = new HashMap<>();
	
	public Wagon(List<Podrozny> podrozni) {
		for (int i=1;i<9;i++) {
			stoliki.put("Stolik"+i, new TreeSet<Podrozny>());
		}
		for (Podrozny p : podrozni) {
			String stolik = p.getBilet().getNazwaStolika();
			stoliki.get(stolik).add(p);
		}
	}
	public Set<Podrozny> getPasazerowiePrzyStoliku(String stolik){
		return stoliki.get(stolik);
	}
	public Set<String> getNazwyStolikow(){
		return stoliki.keySet();
	}
	public void usunPasazera(Podrozny p) {
	        stoliki.get(p.getBilet().getNazwaStolika()).remove(p);
	    }
}
