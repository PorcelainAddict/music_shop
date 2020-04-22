package musical_shoppe;


import Behaviours.ISell;

import java.util.ArrayList;

public class Shoppe {
    private String name;
    private ArrayList<ISell> stock;


    public Shoppe(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

}