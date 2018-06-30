package ch.guggisberg.stefan.state;

public class Tor {
	private Zustand zustand = new Offen(this);

	public void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}

	public void oeffnen() {
		zustand.oeffnen();
	}
	public void schliessen() {
		zustand.schliessen();
	}
	public void abschliessen() {
		zustand.abschliessen();;
	}
	public void audschliessen() {
		zustand.aufschliessen();;
	}
}
