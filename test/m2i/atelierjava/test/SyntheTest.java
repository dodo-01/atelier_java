/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import m2i.atelierjava.entite.Synthe;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SyntheTest {

    @Test
    public void testVolumePlusOk() {

        Synthe v = new Synthe();
       // System.out.println(v.getVolume());
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();

        Assert.assertEquals(10, v.getVolume() );
    }

    @Test
    public void testAllumerOnOff() {
       
        Synthe v = new Synthe();                 //variable

        //boolean allume = v.isOn();
        
        Assert.assertFalse(v.isOn() );           //fonction : c'est une donnée
        
        v.allumageOnOff();
    //  Assert.assertTrue(v.isOn() );
    
        v.allumageOnOff();      
    //  Assert.assertFalse(v.isOn() );
         
    }

   
    @Test

    public void testJouerNoteOK() {

        Synthe synth = new Synthe();

        synth.allumageOnOff();
        synth.jouerNote("FA#3");
    }

    
    @Test
    
    public void b() throws MidiUnavailableException, InterruptedException {

    Synthesizer synth = MidiSystem.getSynthesizer();

    synth.open();
    MidiChannel[] channels = synth.getChannels();
    Instrument[] intrus = synth.getDefaultSoundbank().getInstruments();
  //  synth.loadInsttrument (instrus[1]);
    channels[5].noteOn(30, 600);
    Thread.sleep(10000);
}

    public SyntheTest() {
    }
    
}
