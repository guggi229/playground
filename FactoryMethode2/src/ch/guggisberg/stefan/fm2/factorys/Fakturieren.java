package ch.guggisberg.stefan.fm2.factorys;

import ch.guggisberg.stefan.fm2.products.Dokument;

public abstract class Fakturieren {

	public abstract Dokument erzeugeDokument();
	
	public void fakturiereDokument() {
	
		Dokument dokument = erzeugeDokument();
		if (!isValid(dokument)) {
			throw new IllegalArgumentException("Das Dokuemnt ist nicht gültig");
		}
	}
	
	public boolean isValid(Dokument dokument) {
		if(dokument.getBelegnummer()==0) {
			return false;
		}
		return true;
	}
}
