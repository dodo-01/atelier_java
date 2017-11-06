/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class FilmTest {

    @Test
    public void nouveauFilm() {

        Film f1 = new Film();
        f1.setTitre("dracula");
        f1.setSynopsis("vampire");
        f1.setDateCreation(new Date(1981, 01, 01));
        f1.setAnneeDeProduction(1982);

        f1.initialise("dracula", "vampire", 1981, 1982);
        f1.affiche();

        Film f2 = new Film();
        f2.setTitre("kung fu panda");
        f2.setSynopsis("anime");
        f2.setDateCreation(new Date(1981, 01, 01));
        f2.setAnneeDeProduction(2010);

        f2.initialise("kung fu panda", "anime", 2009, 2010);
        f2.affiche();

        System.out.println(f1.getTitre() + " " + f1.getAnneeDeProduction());
        System.out.println(f2.getTitre() + " " + f2.getAnneeDeProduction());
    }

    Date d = new Date();
}
