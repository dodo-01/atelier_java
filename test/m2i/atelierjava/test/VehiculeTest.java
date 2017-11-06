/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class VehiculeTest {

    @Test
    public void testAvion(){
        
        Avion a = new Avion("boeing", false, "457", "blanc", 200, 0, 0, 0, 800);
        a.avancer();
        a.afficher();
    }
    
    @Test
    public void testVehicule() {

        Vehicule vehic1 = new Vehicule("Ferrari", false, "F-50", "rouge", 2, 0, 0, 0,100);
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.reculer();
        vehic1.afficher();

    }

     @Test
    public void testSousMarin(){
//        
        SousMarin s1 = new SousMarin();
        s1.setPas(10);
        s1.setMonte(false);
        s1.afficher();
        s1.avancer();
    }
    
}
