/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieTest.java;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {

    @Test
    public void serie() {

        Serie s1 = new Serie();
//        s1.setTitre("Twilight");
//        s1.setAnneeDeProduction(2000);
//        s1.setNbreDeSaisons(3);
//        s1.setSynopsis("Vampire");
        
        s1.initialise("Dexter", "Sang", 8, 2010);
        s1.affiche();

        Serie s2 = new Serie();
//        s2.setTitre("Dexter");
//        s2.setAnneeDeProduction(2010);
//        s2.setNbreDeSaisons(8);
//        s2.setSynopsis("Sang");
        

        s2.initialise("Twilight", "Vampire", 3, 2000);
        s2.affiche();
    }

}
