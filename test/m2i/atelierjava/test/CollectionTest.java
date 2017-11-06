/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class CollectionTest {

    @Test
    public void testList() {

        List<String> listeFilms = new ArrayList<>();

        listeFilms.add("Dracula");
        listeFilms.add("Matrix");
        listeFilms.add("Winnie l'ourson");

        for (String film : listeFilms) {

            System.out.println(film);
        }

        List<String> nouveauxFilms = new ArrayList<>();

        nouveauxFilms.add("Matrix 2");
        nouveauxFilms.add("Ghost");

        for (String film : nouveauxFilms) {
            System.out.println(film);

        }
    }

    @Test
    public void testSommeListFranceBelgiquePlusEspagneItalieTotal4() {

        List<String> listeFrBe = new ArrayList<>();
        listeFrBe.add("France");
        listeFrBe.add("Belgique");
        
        List<String> listeEsIt = new ArrayList<>();
        listeEsIt.add("Espagne");
        listeEsIt.add("Italie");
 
        List<String>listeTotale = new ArrayList<>();
        listeTotale.addAll(listeFrBe);
        listeTotale.addAll(listeEsIt);

        int nbElem = listeTotale.size();
        Assert.assertEquals(4, nbElem);
    }
    }
