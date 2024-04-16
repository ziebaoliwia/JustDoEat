package Entities;

import java.util.ArrayList;
import java.util.Date;

public class PlanificationRepas {
    private ArrayList<Recette> recettes;
    private ArrayList<String> personnes;

    private Date date;

    public PlanificationRepas(Date date){
        this.date = date;
        recettes = new ArrayList<Recette>();
        personnes = new ArrayList<String>();
    }

    public ArrayList<Recette> getRecettes() {
        return recettes;
    }

    public void setRecettes(ArrayList<Recette> recettes) {
        this.recettes = recettes;
    }

    public void addRecette(Recette recette){
        this.recettes.add(recette);
    }

    public ArrayList<String> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<String> personnes) {
        this.personnes = personnes;
    }
    public void addPersonne(String personne){
        this.personnes.add(personne);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}