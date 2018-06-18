package ch.guggisberg.stefan.fm2.products;

public class Gutschrift extends Dokument {
	private float Gutschriftbetrag;
	private String name = "Ich bin eine Gutschrift"; 

	public float getGutschriftbetrag() {
		return Gutschriftbetrag;
	}

	public void setGutschriftbetrag(float gutschriftbetrag) {
		Gutschriftbetrag = gutschriftbetrag;
	}

	public String getName() {
		return name;
	}

}
