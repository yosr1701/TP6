package TP6;

abstract class Ustensile {
    protected int anneeFab;

    public Ustensile(int anneeFab) {
        this.anneeFab = anneeFab;
    }
    public int getAnneeFab() {
        return anneeFab;
    }
    public double calculerValeur() {
        int age = 2022 - anneeFab ;
        if (age<50)
        	{
        	return 0;
        	}
        else 
        	{
        	return age-50;
        	}
    }

}