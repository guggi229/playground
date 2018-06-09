package ch.guggisberg.stefan.fm2.factorys;

import ch.guggisberg.stefan.fm2.products.Dokument;
import ch.guggisberg.stefan.fm2.products.Gutschrift;

public class GutschriftFakturieren extends Fakturieren {
	
	
	@Override
	public Dokument erzeugeDokument() {
		return new Gutschrift();
	}
	
	
	public boolean isValid(Dokument dokument) {
		return super.isValid(dokument) && ((Gutschrift) dokument).getGutschriftbetrag() >0;
	
	}

}
