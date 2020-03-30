package Instruments;

import javax.sound.midi.Instrument;

public class Kazoo extends Instrument {
    private String sound;

    public Kazoo(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "ddddzzzzzoooooooooo";
    }

    public String getSound() {
        return sound;
    }
}
