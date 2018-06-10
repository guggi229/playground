package ch.guggisberg.stefan.ch.afp;

import ch.guggisberg.stefan.ch.afp.boden.Boden;
import ch.guggisberg.stefan.ch.afp.einfriedung.Einfiredung;
import ch.guggisberg.stefan.ch.afp.planzen.Planze;

public interface AbstrakteGartenfabrik {

	
	public Planze planzeSetzen();
	
	public Boden bodenLegen();
	
	public Einfiredung einfrieden();
	
	
	
}
