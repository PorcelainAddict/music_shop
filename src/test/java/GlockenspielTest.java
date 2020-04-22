import musical_shoppe.Glockenspiel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlockenspielTest {

    Glockenspiel glockenspiel;

    @Before
    public void before(){
        glockenspiel = new Glockenspiel("Glockies", "Tangerine", 150, 300);
    }

    @Test
    public void hasModel() {
        assertEquals("Glockies", glockenspiel.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Tangerine", glockenspiel.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Percussion", glockenspiel.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Ting ting ting ting ting tang", glockenspiel.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(150, glockenspiel.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(300, glockenspiel.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(150, glockenspiel.calculateProfit());
    }

}
