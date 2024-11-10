package TP6;

class cuillere extends Ustensile {
    private double longueur;

    public cuillere(int anneeFab, double longueur) {
        super(anneeFab);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }
    
}
