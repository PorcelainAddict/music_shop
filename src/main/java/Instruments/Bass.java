package Instruments;


import javax.sound.midi.Instrument;

public class Bass extends Instrument {

    private int strings;




    public Bass(String material, String colour, double price, String type, int strings, String sound, double RRP) {
        super(material, colour, price, type, sound, RRP);
            this.strings = strings;

    }

    public int getStrings() {
        return strings;
    }


}
