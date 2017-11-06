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
public class Synthe {

    protected boolean on;
    protected String instrument;
    protected int volume;

    public Synthe() {

        this.on = false;
        this.volume = 10;
        this.instrument = "piano";
    }

    public void initialise(boolean on, String instrument, int volume) {

        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
    }

    public void affiche() {
                                    //formule de concetene
        System.out.println(this.on + " " + this.instrument+ " "+ this.volume);
    }

    
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //
    public void allumageOnOff() {

        if (this.on == true) {
            this.on = false;
            instrument = "piano";
            volume = 5;

            System.out.println("Synthe éteint.");

        } else {
            this.on = true;
            System.out.println("Synthe allumé. Instrument : " + this.instrument);
        }
    }

    public void volumePlus() {

        if (volume < 10) {
            volume = volume + 1; //ou volume ++
        } else {

            System.out.println("Volume max atteint");
        }
    }

    public void volumeMoins() {

        if (volume > 0) {
            volume = volume - 1; //ou volume --
        } else {
            if (this.on) {
                System.out.println("Volume min atteint");
            }
        }
    }

    public void jouerNote(String noteAJouer) {
        System.out.println(noteAJouer + " " + instrument + " " + volume + " " + on);
    }

}
