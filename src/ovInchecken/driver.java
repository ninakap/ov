package ovInchecken;

public class driver {
	public static void main(String[] args) {
		OplaadPaal paal = new OplaadPaal(5, 10);

		paal.inchecken();
		paal.opladen(10);
		paal.inchecken();
	}

}
