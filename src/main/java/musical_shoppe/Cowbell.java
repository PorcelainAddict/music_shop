package musical_shoppe;


import Behaviours.IPlay;
import Behaviours.ISell;

public class Cowbell extends MusicalThing implements IPlay, ISell {

    private String brand;
    private int cost;
    private int rrp;

    public Cowbell(String brand, String colour, int cost, int rrp){
        super(colour, "idiophone hand percussion");
        this.brand = brand;
        this.cost =cost;
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
        return "Tonk tonk tonk tonk";
    }

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
