package ch.guggisberg.stefan.state;

public abstract class Zustand {

	protected Tor tor;
	
	Zustand(Tor tor){
		this.tor= tor;
	}
	
	protected abstract void schliessen();
	protected abstract void oeffnen();
	protected abstract void abschliessen();
	protected abstract void aufschliessen();
	
	
}
