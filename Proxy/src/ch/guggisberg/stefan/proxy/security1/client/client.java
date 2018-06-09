package ch.guggisberg.stefan.proxy.security1.client;

import ch.guggisberg.stefan.proxy.security1.ProxyKonto;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Setup Real Konto
		
		ProxyKonto pk = new ProxyKonto("Müller", "123");
		
		System.out.println("Kontostand: " + pk.getBetrag());
		
		pk.setBetrag(20);
		
		System.out.println("Kontostand: " + pk.getBetrag());
		
		
		ProxyKonto pk1 = new ProxyKonto("Müller", "1234");
		
		System.out.println("Kontostand: " + pk1.getBetrag());
		

		
	}

}
