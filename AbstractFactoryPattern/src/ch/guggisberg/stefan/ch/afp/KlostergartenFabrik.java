package ch.guggisberg.stefan.ch.afp;

import ch.guggisberg.stefan.ch.afp.boden.Boden;
import ch.guggisberg.stefan.ch.afp.boden.Steinpplatte;
import ch.guggisberg.stefan.ch.afp.einfriedung.Einfiredung;
import ch.guggisberg.stefan.ch.afp.einfriedung.Steinmauer;
import ch.guggisberg.stefan.ch.afp.planzen.Heilkraut;
import ch.guggisberg.stefan.ch.afp.planzen.Planze;

public class KlostergartenFabrik implements AbstrakteGartenfabrik {

	@Override
	public Planze planzeSetzen() {
		return new Heilkraut();
	}

	@Override
	public Boden bodenLegen() {
		return new Steinpplatte();
	}

	@Override
	public Einfiredung einfrieden() {
		return new Steinmauer();
	}

}
