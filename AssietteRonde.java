package TP6;

class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int anneeFab, double rayon) {
        super(anneeFab);
        this.rayon = rayon;
    }

    public double calculerSurface() {
        return 3.14 * rayon * rayon;
    }
    public double calculerValeur() {
    	double valeur = super.calculerValeur();
    	return valeur ;
    }
}
