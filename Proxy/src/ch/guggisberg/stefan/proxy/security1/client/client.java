package ch.guggisberg.stefan.proxy.security1.client;

import ch.guggisberg.stefan.proxy.security1.ProxyKonto;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Setup Real Konto
		
		ProxyKonto pk = new ProxyKonto("M�ller", "123");
		
		System.out.println("Kontostand: " + pk.getBetrag());
		
		pk.setBetrag(20);
		
		System.out.println("Kontostand: " + pk.getBetrag());
		
		System.out.println("Muss nun einen Access Fehler geben: (falsches  Passwort)");
		
		ProxyKonto pk1 = new ProxyKonto("M�ller", "1234");
		
		System.out.println("Kontostand: " + pk1.getBetrag());
		
		// Muss Fehler werfen!

		
	}

}
