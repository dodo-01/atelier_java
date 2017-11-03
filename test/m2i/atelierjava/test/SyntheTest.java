/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SyntheTest {

    public SyntheTest() {
    }

    @Test
    public void testVolumePlusOk() {

        Synthetiseur v = new Synthetiseur();
        System.out.println(v.getVolume());
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();

        System.out.println(v.getVolume());
    }

    @Test
    public void testAllumerOnOff() {
        Synthetiseur s = new Synthetiseur();
        System.out.println(s.isOn());
        s.allumageOnOff();
        System.out.println(s.isOn());
        s.allumageOnOff();
        System.out.println(s.isOn());

    @Test
    public void testSynthe() {
        testSynthe.s1 = new testSynthe();

            s1.initialise("allumage", instrument, volume);
            s1.affiche();
        }

        @Test

        public void testJouerNoteOK
        
            (){
        
        Synthetiseur synth = new Synthetiseur();

            synth.allumageOnOff();
            synth.jouerNote("FA#3")
        }

    }

// 
//    @Test
//    public void testSynthe() throws MidiUnavailableException, InterruptedException {
//
//    Synthesizer synth = MidiSystem.getSynthesizer();
//
//    synth.open();
//    MidiChannel[] channels = synth.getChannels();
//    Instrument[] intrus = synth.getDefaultSoundbank().getInstruments();
//    synth.loadInsttrument ( instrus[1]);
//    channels[5].noteOn(30, 600);
//    Thread.sleep(10000);
//    
//} 
}
