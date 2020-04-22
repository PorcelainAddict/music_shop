package musical_shoppe;


import Behaviours.IPlay;
import Behaviours.ISell;

public class Triangle extends MusicalThing implements IPlay, ISell {
    private String brand;
    private int cost;
    private int rrp;

    public Triangle(String colour, String brand, int cost, int rrp){
        super(colour, "Idiophone");
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

    public String play() {
        return "tinga-ling";
    }

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
