package musical_shoppe;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends MusicalThing implements IPlay, ISell {

    private int numberOfStrings;
    private String brand;
    private int cost;
    private int rrp;

    public Guitar(String brand, String colour, int cost, int rrp, int numberOfStrings){
        super(colour, "String");
        this.numberOfStrings = numberOfStrings;
        this.brand = brand;
        this.cost = cost;
        this.rrp = rrp;

    }

    public String getBrand() {
        return brand;
    }

    public int getCost() {
        return cost;
    }

    public int getRrp() {
        return rrp;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "cries in guitar";
    }

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
