import musical_shoppe.Drumset;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsetTest {

    Drumset drumset;

    @Before
    public void before(){
        drumset = new Drumset("Pearl", "Green", 500, 1000);
    }

    @Test
    public void hasModel() {
        assertEquals("Pearl", drumset.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Green", drumset.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Percussion", drumset.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Badum tscccchhhh", drumset.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(500, drumset.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(1000, drumset.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(500, drumset.calculateProfit());
    }


}
