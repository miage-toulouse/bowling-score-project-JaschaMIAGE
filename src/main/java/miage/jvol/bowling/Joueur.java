package miage.jvol.bowling;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private int scoreActuel;
    private int nbFrames;
    private ArrayList<Frame> frames;

    public Joueur(String nom){
        this.nom = nom;
        this.frames = new ArrayList<>();
        this.scoreActuel = 0;
        this.nbFrames = 0;
    }

    public int calculerScore(){

        return 0;

    }

    public boolean lancer(){

        return false;

    }

    public String getNom() {
        return nom;
    }

    public int getScoreActuel() {
        return scoreActuel;
    }

    public int getNbFrames() {
        return nbFrames;
    }

    public String toString(){
        return "";
    }



}
