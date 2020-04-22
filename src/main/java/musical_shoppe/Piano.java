package musical_shoppe;


import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends MusicalThing implements IPlay, ISell {

    private int keys;
    private String brand;
    private int cost;
    private int rrp;

    public Piano(String brand, String colour, int cost, int rrp, int keys){
        super(colour, "Percussion");
        this.keys = keys;
        this.brand = brand;
        this.cost = cost;
        this.rrp = rrp;

    }

    public int getKeys() {
        return keys;
    }

    public String play() {
        return "pia pia piaaannnnoooo piaaaannoooo piiaaaannnoooo";
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

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
