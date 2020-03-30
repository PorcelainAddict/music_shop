import Behaviours.ISell;
import Behaviours.IPlay;

public abstract class MusicalThing implements IPlay, ISell {

    private String material;
    private String colour;
    private String type;
    private double RRP;
    private double price;




    public MusicalThing(String material, String colour, double price, String type, double RRP){
    this.material = material;
    this.colour = colour;
    this.price = price;
    this.type = type;
    this.RRP = RRP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }


    public double getRRP() {
        return RRP;
    }

    public double markUp(){
        return this.RRP = this.price;
    }
}

