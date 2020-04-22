package musical_shoppe;

public abstract class MusicalThing{

    private String colour;
    private String type;

    public MusicalThing(String colour, String type){
    this.colour = colour;
    this.type = type;

    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

}

