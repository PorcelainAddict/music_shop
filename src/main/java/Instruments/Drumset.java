package Instruments;

import javax.sound.midi.Instrument;

public class Drumset extends Instrument {
    private String sound;

    public Drumset(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "Badum tscccchhhh";
    }

    public String getSound() {
        return sound;
    }
}
