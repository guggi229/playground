package ch.guggisberg.stefan.proxy.security1;

public class Konto implements KontoInterface {

	private float betrag = 100;
	private String name = "M�ller";

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
