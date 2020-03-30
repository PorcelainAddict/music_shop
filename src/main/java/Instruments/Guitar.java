package Instruments;

public class Guitar {
    private String sound;
    private int numberOfStrings;

    public Guitar(String material, String colour, double price, String type){
        super(material, colour, price, type);
        this.sound = "cries in guitar";
        this.numberOfStrings = 6;
    }

    public String getAxe() {
        return sound;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
