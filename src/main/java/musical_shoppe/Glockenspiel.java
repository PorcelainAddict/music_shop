package musical_shoppe;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Glockenspiel extends MusicalThing implements IPlay, ISell {
    private String brand;
    private int cost;
    private int rrp;

    public Glockenspiel(String brand, String colour, int cost, int rrp){
        super(colour,"Percussion");
        this.brand = brand;
        this.cost =cost;
        this.rrp = rrp;

    }

    public String play() {
        return "Ting ting ting ting ting tang";
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
