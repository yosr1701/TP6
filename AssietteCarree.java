package TP6;

class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int anneeFab, double cote) {
        super(anneeFab);
        this.cote = cote;
    }

    public double calculerSurface() {
        return cote * cote;
    }
    public double calculerValeur() {
    	double valeur = super.calculerValeur();
    	return valeur*5 ;
    }
}
