package ovInchecken;

public class AnoniemeChipkaart {
	    boolean ingecheckt;
	    double instaptarief;
	    
	    public void chipkaart(double instaptarief) {
	        this.ingecheckt = false;
	        this.instaptarief = instaptarief;
	    }
	    

		public void inchecken() {
			// TODO Auto-generated method stub
		      if (!ingecheckt) {
		            ingecheckt = true;
		            System.out.println("Inchecken gelukt.");
		        } else {
		            System.out.println("U bent al ingecheckt!");
		        }
		    }

		}
	
