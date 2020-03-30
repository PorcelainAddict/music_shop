import Accessories.*;
import Instruments.*;

import java.util.ArrayList;

public class Shoppe {

//    private Bass bass;
//    private Cowbell cowbell;
//    private Drumset drumset;
//    private Glockenspiel glockenspiel;
//    private Guitar guitar;
//    private Kazoo kazoo;
//    private Piano piano;
//    private Triangle triangle;
//    private Violin violin;
//    private Drumsticks drumsticks;
//    private Plectrums plectrums;
//    private SheetMusic sheetMusic;
//    private Straps straps;
//    private Strings strings;
    private int till;
    private ArrayList<MusicalThing> stock;

    public Shoppe(Bass bass, Cowbell cowbell, Drumset drumset, Glockenspiel glockenspiel, Guitar guitar, Kazoo kazoo, Piano piano, Triangle triangle, Violin violin, Drumsticks drumsticks, Plectrums plectrums, SheetMusic sheetMusic, Straps straps, Strings strings, int till){
//        this.bass = bass;
//        this.cowbell = cowbell;
//        this.drumset = drumset;
//        this.glockenspiel = glockenspiel;
//        this.guitar = guitar;
//        this.kazoo = kazoo;
//        this.piano = piano;
//        this.triangle = triangle;
//        this.violin = violin;
//        this.drumsticks = drumsticks;
//        this.plectrums = plectrums;
//        this.sheetMusic = sheetMusic;
//        this.straps = straps;
//        this.strings = strings;
        this.till = till;
        this.stock = new ArrayList<MusicalThing>();
    }

    public Bass getBass() {
        return bass;
    }

    public Cowbell getCowbell() {
        return cowbell;
    }

    public Drumset getDrumset() {
        return drumset;
    }

    public Glockenspiel getGlockenspiel() {
        return glockenspiel;
    }

    public Guitar getGuitar() {
        return guitar;
    }

    public Kazoo getKazoo() {
        return kazoo;
    }

    public Piano getPiano() {
        return piano;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public Violin getViolin() {
        return violin;
    }

    public Drumsticks getDrumsticks() {
        return drumsticks;
    }

    public Plectrums getPlectrums() {
        return plectrums;
    }

    public SheetMusic getSheetMusic() {
        return sheetMusic;
    }

    public Straps getStraps() {
        return straps;
    }

    public Strings getStrings() {
        return strings;
    }

    public double getTill() {
        return till;
    }

    public int getStock(){
        return stock.size();
    }
}
