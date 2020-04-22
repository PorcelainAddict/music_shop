package musical_shoppe;


import Behaviours.IPlay;
import Behaviours.ISell;

public class Violin extends MusicalThing implements IPlay, ISell {
    private String brand;
    private int numberOfStrings;
    private int cost;
    private int rrp;


    public Violin(String brand, String colour, int cost, int rrp, int numberOfStrings){
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
        return "room fills with melancholy";
    }

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
