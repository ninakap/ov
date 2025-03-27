package ovInchecken;

public class OplaadPaal {
	boolean ingecheckt;
	double instaptarief;
	double saldo;

	public OplaadPaal(double saldo, double instaptarief) {
		this.ingecheckt = false;
		this.saldo = saldo;
		this.instaptarief = instaptarief;
	}

	public void inchecken() {
		if (ingecheckt) {
			System.out.println("U bent al ingecheckt!");
		} else if (saldo >= instaptarief) {
			saldo -= instaptarief;
			ingecheckt = true;
			System.out.println("Inchecken gelukt. nieuw saldo: " + saldo);
		} else {
			System.out.println("Niet genoeg saldo om in te checken.");
		}
	}



	public void opladen(double bedrag) {
		saldo += bedrag;
		System.out.println("Saldo opgewaardeerd! Nieuw saldo: " + saldo);
	}
}
