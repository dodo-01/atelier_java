/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Film {

    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;

    public void affiche() {

        System.out.println(String.format("Film: %s %s %d %s", this.titre, this.synopsis, this.anneeDeProduction, this.dateCreation));
    }

    public void initialise(String titre, String synopsis, int dateCreation, int anneeDeProduction) {

        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeDeProduction = anneeDeProduction;
//        this.dateCreation = dateCreation;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

}
