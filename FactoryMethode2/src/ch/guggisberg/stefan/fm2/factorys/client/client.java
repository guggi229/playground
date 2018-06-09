package ch.guggisberg.stefan.fm2.factorys.client;

import ch.guggisberg.stefan.fm2.factorys.GutschriftFakturieren;
import ch.guggisberg.stefan.fm2.products.Gutschrift;

/**
 * Aus dem Buch Matthias Geirhos
 * 
 * Entwurfsmuster Seite 49 
 * 
 * @author guggi229
 *
 */
public class client {

	public static void main(String[] args) {
		// Mit Casting
		System.out.println("Start:");
		GutschriftFakturieren	gf = new GutschriftFakturieren(); 				// Warum nicht static
		Gutschrift d1 =(Gutschrift) gf.erzeugeDokument();						// Warum Casting
		System.out.println(d1.getName()); 
		
		// Ohne Casting
		Gutschrift d2 =(Gutschrift) gf.erzeugeDokument();
		

	}

}
