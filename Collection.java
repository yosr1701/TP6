package TP6;

public class Collection {

	    public static void main(String[] args) {
	        Ustensile[] us = new Ustensile[5];
	        us[0] = new AssietteRonde(1926, 8.4);
	        us[1] = new cuillere(1881, 7.3);
	        us[2] = new AssietteCarree(1935, 5.6);
	        us[3] = new cuillere(1917, 8.8);
	        us[4] = new AssietteRonde(1837, 5.4);

	        afficherCuilleres(us);
	        afficherSurfaceAssiettes(us);
	        afficherValeurTotal(us) ;
	    }

	    static void afficherCuilleres(Ustensile[] us) {
	        int nbCuilleres = 0;
	        for (int i = 0; i < us.length; i++) {
	            if (us[i] instanceof cuillere) {
	                nbCuilleres++;
	            }
	        }
	        System.out.println("Il y a " + nbCuilleres + " cuillères.");
	    }


	    static void afficherSurfaceAssiettes(Ustensile[] us) {
	        double surfaceTotale = 0;
	        for (int i = 0; i < us.length; i++) {
	            if (us[i] instanceof Assiette) {
	                Assiette assiette = (Assiette) us[i];
	                surfaceTotale += assiette.calculerSurface();
	            }
	        }
	        System.out.println("La surface totale des assiettes est : " + surfaceTotale);
	    }
	    static void afficherValeurTotal(Ustensile[] us) {
	    	double valeurTotale = 0;
	        for (int i = 0; i < us.length; i++) {
	        	valeurTotale += us[i].calculerValeur();
	        }
	        System.out.println("La valeur totale des ustensiles  : " + valeurTotale);
	    }
}



