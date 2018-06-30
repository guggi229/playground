package ch.guggisberg.stefan.state;

public class Geschlossen extends Zustand {

	Geschlossen(Tor tor) {
		super(tor);
	}

	@Override
	protected void schliessen() {
		System.out.println("Das Tor ist schon geschlossen");

	}

	@Override
	protected void oeffnen() {
		System.out.println("Das Tor wird geöfnnet");
		tor.setZustand(new Offen(tor));
	}

	@Override
	protected void abschliessen() {
		System.out.println("Das Tor wird abgeschlossen");
	}

	@Override
	protected void aufschliessen() {
		System.out.println("Das Tor ist bereits aufgeschlossen");
	}

}
