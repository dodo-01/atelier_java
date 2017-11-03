/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Serie {
   
    private String titre;
    private int anneeDeProduction;
    private int nbreDeSaisons;
    private String synopsis;

    public void initialise(String titre, String synopsis, int nbreDeSaisons, int anneeDeProduction){
    
        this.titre = titre;
        this.synopsis = synopsis;
        this.nbreDeSaisons = nbreDeSaisons;
        this.anneeDeProduction = anneeDeProduction;
       
}
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction;
    }

    public int getNbreDeSaisons() {
        return nbreDeSaisons;
    }

    public void setNbreDeSaisons(int nbreDeSaisons) {
        this.nbreDeSaisons = nbreDeSaisons;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
  
    public void affiche(){
        
   
    System.out.println(this.getTitre() + " " + this.getAnneeDeProduction() );
    System.out.println("Nombre de saisons : "+ this.getNbreDeSaisons());
    System.out.println("Synopsis :" + this.getSynopsis());
    
            } 
}
