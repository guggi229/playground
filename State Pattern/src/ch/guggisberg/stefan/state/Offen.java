package ch.guggisberg.stefan.state;

public class Offen extends Zustand {

	Offen(Tor tor) {
		super(tor);
	}
	@Override
	protected void schliessen() {
		System.out.println("Das Tor wird geschlossen");
		tor.setZustand(new Geschlossen(tor));
	}

	@Override
	protected void oeffnen() {
		System.out.println("Das Tor ist bereits offen");
	}

	@Override
	protected void abschliessen() {
		System.out.println("Das Tor ist offen");
	}

	@Override
	protected void aufschliessen() {
		System.out.println("Das Tor ist nicht abgeschlossen");
	}

}
