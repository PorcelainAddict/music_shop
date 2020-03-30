package Instruments;

import javax.sound.midi.Instrument;

public class Cowbell extends Instrument {
    private String sound;

    public Cowbell(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "Tonk tonk tonk tonk";
    }

    public String getSound() {
        return sound;
    }
}
