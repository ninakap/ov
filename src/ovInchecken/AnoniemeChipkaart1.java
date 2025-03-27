package ovInchecken;

public class AnoniemeChipkaart1 extends OplaadPaal {

	public class Main {
	    public static void main(String[] args) {{
	            OplaadPaal kaart = new OplaadPaal(5, 10);

	            kaart.inchecken(); // Probeer in te checken (moet mislukken)
	            kaart.opladen(10); // Laad €10 op
	            kaart.inchecken(); // Probeer opnieuw in te checken 
	        }
	    
	    }
	}
  

