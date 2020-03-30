package Instruments;

import javax.sound.midi.Instrument;

public class Triangle extends Instrument {
    private String sound;

    public Triangle(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "tinga-ling";
    }

    public String getSound() {
        return sound;
    }
}
