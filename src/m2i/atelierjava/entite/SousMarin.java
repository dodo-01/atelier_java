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
public class SousMarin extends Vehicule {

    private boolean monte;

    public boolean isMonte() { //creation du constructeur
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    public SousMarin(){
        
    }
    
    public SousMarin(boolean monte, String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
    }


   @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
    }

 //  if(this.monte==true){
  //   y = y + pas;
  //          }else{
  //  y = y - pas;
//}
}
