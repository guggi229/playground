package ch.guggisberg.stefan.proxy.security1;

public class ProxyKonto implements KontoInterface {

	private String name;
	private String password;
	private Konto konto;
	
	 public ProxyKonto(String name, String password) {
		this.name = name;
		this.password = password;
		konto = new Konto();
	}
	
	
	@Override
	public void setBetrag(float betrag) {
		if (isValid()) {
			konto.setBetrag(betrag);
		}

	}

	@Override
	public float getBetrag() {
		if (isValid()) {
			return konto.getBetrag();
		}
		throw new IllegalAccessError();
		
	}
	
	private boolean isValid() {
		
		if (name.equals("Müller") && password.equals("123")) return true;
		return false;
	}

}
