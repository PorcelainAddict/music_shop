package Instruments;


import javax.sound.midi.Instrument;

public class Piano extends MusicalThing {
    private String sound;
    private int keys;

    public Piano(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "pia pia piaaannnnoooo piaaaannoooo piiaaaannnoooo";
        this.keys = 88;
    }

    public String getSound() {
        return sound;
    }

    public int getKeys() {
        return keys;
    }

    public String playSound(Instrument instrument){
        return
    }
}
