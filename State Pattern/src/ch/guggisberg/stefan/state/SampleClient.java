package ch.guggisberg.stefan.state;

public class SampleClient {

	public static void main(String[] args) {
		Tor t = new Tor();

		t.abschliessen();
		t.audschliessen();
		t.schliessen();
		t.schliessen();
		t.oeffnen();
	}

}
