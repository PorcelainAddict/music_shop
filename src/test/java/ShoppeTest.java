import Accessories.*;
import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppeTest {

    Shoppe shoppe;
    Bass bass;
    Cowbell cowbell;
    Drumset drumset;
    Glockenspiel glockenspiel;
    Guitar guitar;
    Kazoo kazoo;
    Piano piano;
    Triangle triangle;
    Violin violin;
    Drumsticks drumsticks;
    Plectrums plectrums;
    SheetMusic sheetMusic;
    Straps straps;
    Strings strings;

    @Before
    public void before(){
        bass = new Bass("wood", "yellow", 700.00, "stringed");
        cowbell = new Cowbell("metal", "black", 50.00, "percussion");
        drumset = new Drumset("wood", "red", 800.00, "percussion");
        glockenspiel = new Glockenspiel("metal", "steel", 90.00, "percussion");
        guitar = new Guitar("wood", "aqua-sunrise", 600.00, "stringed");
        kazoo = new Kazoo("metal", "white", 10.00, "mirliton");
        piano = new Piano("wood", "white", 1000.00, "percussion");
        triangle = new Triangle("steel", "silver", 10.00, "percussion");
        violin = new Violin("wood", "brown", 500.00, "stringed");
        drumsticks = new Drumsticks();
        plectrums = new Plectrums();
        sheetMusic = new SheetMusic();
        straps = new Straps();
        strings = new Strings();
        shoppe = new Shoppe(bass, cowbell, drumset, glockenspiel, guitar, kazoo, piano, triangle, violin, drumsticks, plectrums, sheetMusic, straps, strings, 40000);
    }

    @Test
    public void canGetBass(){
        assertEquals(bass, shoppe.getBass());
    }

    @Test
    public void canGetCowbell(){
        assertEquals(cowbell, shoppe.getCowbell());
    }

    @Test
    public void canGetDrumset(){
        assertEquals(drumset, shoppe.getDrumset());
    }

    @Test
    public void canGetGlockenspiel(){
        assertEquals(glockenspiel, shoppe.getGlockenspiel());
    }

    @Test
    public void canGetGuitar(){
        assertEquals(guitar, shoppe.getGuitar());
    }

    @Test
    public void canGetKazoo(){
        assertEquals(kazoo, shoppe.getKazoo());
    }

    @Test
    public void canGetPiano(){
        assertEquals(piano, shoppe.getPiano());
    }

    @Test
    public void canGetTriangle(){
        assertEquals(triangle, shoppe.getTriangle());
    }

    @Test
    public void canGetViolin(){
        assertEquals(violin, shoppe.getViolin());
    }

    @Test
    public void canGetDrumsticks(){
        assertEquals(drumsticks, shoppe.getDrumsticks());
    }

    @Test
    public void canGetPlectrums(){
        assertEquals(plectrums, shoppe.getPlectrums());
    }

    @Test
    public void canGetSheetMusic(){
        assertEquals(sheetMusic, shoppe.getSheetMusic());
    }

    @Test
    public void canGetStraps(){
        assertEquals(straps, shoppe.getStraps());
    }

    @Test
    public void canGetStrings(){
        assertEquals(strings, shoppe.getStrings());
    }

    @Test
    public void canGetTill(){
        assertEquals(40000, shoppe.getTill(), 0.01);
    }
}
