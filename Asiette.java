package TP6;

abstract class Assiette extends Ustensile {
    public Assiette(int anneeFab) {
        super(anneeFab);
    }

    public abstract double calculerSurface();
}
