package Instruments;

public class Glockenspiel {
    private String sound;

    public Glockenspiel(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "Ting ting ting ting ting tang";
    }

    public String getSound() {
        return sound;
    }
}
