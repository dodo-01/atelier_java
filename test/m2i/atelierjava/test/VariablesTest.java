/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VariablesTest {

    @Test
    public void testVariablesObjets() {

        String txt1 = new String("coucou");

        // majuscule
        String txt2 = txt1.toUpperCase();

        System.out.println(txt1);
    }

    @Test
    public void testPays() {

        String a = "Jamaique";
        String b = "Kingston";
        String c = b.toUpperCase() + "," + a.toUpperCase();

        System.out.println(c);
    }

    @Test
    public void testEx2() {

        int a = 123;
        String b = ("coucou");
        String c = a + b;
        String d = b + a;

        System.out.println(c);
        System.out.println(d);

    }

    @Test
    public void testEx3() {

        int a = 10;
        String b = "20";
        int c = a + Integer.valueOf(b);
        int d = Integer.valueOf(b) + a;

        System.out.println("a + b = " + c);
        System.out.println("b + a = " + d);

    }

    public int carre(int nbre) {

        return nbre * nbre;
    }

    @Test
    public void testCarre() {

        System.out.println(carre(9));

    }
    
    

}
