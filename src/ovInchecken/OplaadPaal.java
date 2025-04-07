package ovInchecken;

public class OplaadPaal {
	boolean ingecheckt;
	double instaptarief;
	double saldo;
	String locatie;

	public OplaadPaal(double saldo, double instaptarief) {
		this.ingecheckt = false;
		this.saldo = saldo;
		this.instaptarief = instaptarief;
		this.locatie = "";
	}

	public void inchecken(String station) {
		if (ingecheckt) {
			System.out.println("U bent al ingecheckt op station: " + locatie);
		} else if (saldo >= instaptarief) {
			saldo -= instaptarief;
			ingecheckt = true;
			locatie = station;
			System.out.println("Inchecken gelukt bij " + station + ". Nieuw saldo: " + saldo);
		} else {
			System.out.println("Niet genoeg saldo om in te checken.");
		}
	}


	public void uitchecken(double ritPrijs, String station) {
		if (!ingecheckt) {
			System.out.println("U bent nog niet ingecheckt.");
		} else if (saldo >= ritPrijs) {
			saldo -= ritPrijs;
			System.out.println("Uitgecheckt bij " + station + ". Ritprijs: " + ritPrijs);
			System.out.println("Nieuw saldo: " + saldo);
			ingecheckt = false;
			locatie = "";
		} else {
			System.out.println("Niet genoeg saldo om uit te checken.");
		}
	}
}
