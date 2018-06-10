package ch.guggisberg.stefan.ch.afp.client;

import ch.guggisberg.stefan.ch.afp.AbstrakteGartenfabrik;
import ch.guggisberg.stefan.ch.afp.KlostergartenFabrik;
import ch.guggisberg.stefan.ch.afp.boden.Boden;
import ch.guggisberg.stefan.ch.afp.einfriedung.Einfiredung;
import ch.guggisberg.stefan.ch.afp.planzen.Planze;

public class Gartenbau {


	public Gartenbau() {
		AbstrakteGartenfabrik fabrik = new KlostergartenFabrik();
		Boden boden = fabrik.bodenLegen();
		Einfiredung einfriedung = fabrik.einfrieden();
		Planze planze = fabrik.planzeSetzen();
	}
}
