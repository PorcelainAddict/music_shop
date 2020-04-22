package Accessories;

import Behaviours.ISell;

public class Plectrums implements ISell {
    private String brand;
    int cost;
    int rrp;

    public Plectrums(String brand, int cost, int rrp){
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

    public int calculateProfit(){
        return this.rrp - this.cost;
    }
}
