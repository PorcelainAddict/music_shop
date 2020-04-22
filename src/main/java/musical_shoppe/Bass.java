package musical_shoppe;


import Behaviours.IPlay;
import Behaviours.ISell;

public class Bass extends MusicalThing implements IPlay, ISell {

    private String brand;
    private int numberOfStrings;
    private int cost;
    private int rrp;

    public Bass(String brand, String colour, int numberOfStrings, int cost, int rrp) {
        super(colour, "String");
        this.brand = brand;
        this.cost = cost;
        this.rrp = rrp;
        this.numberOfStrings = numberOfStrings;

    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getCost() {
        return cost;
    }

    public int getRrp() {
        return rrp;
    }

    public String play() {
        return "Fuuuuuuuuuuuuunky dulcet tones fulls the room";
    }

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
