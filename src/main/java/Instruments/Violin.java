package Instruments;

import javax.sound.midi.Instrument;

public class Violin extends Instrument {
    private String sound;
    private int numberOfStrings;


    public Violin(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "room fills with melancholy";
        this.numberOfStrings = 4;

    }

    public String getSound() {
        return sound;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


}
