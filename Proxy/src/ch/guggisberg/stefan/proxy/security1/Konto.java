package ch.guggisberg.stefan.proxy.security1;

public class Konto implements KontoInterface {

	private float betrag = 100;
	private String name = "Müller";

	public float getBetrag() {
		return betrag;
	}

	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}

	public String getName() {
		return name;
	}
	
	
	
}
