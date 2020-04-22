import musical_shoppe.Cowbell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowbellTest {

    Cowbell cowbell;

    @Before
    public void before(){
        cowbell = new Cowbell("Oyster's Own", "black", 50, 100);
    }

    @Test
    public void hasBrand() {
        assertEquals("Oyster's Own", cowbell.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("black", cowbell.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("idiophone hand percussion", cowbell.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Tonk tonk tonk tonk", cowbell.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(50, cowbell.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(100, cowbell.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(50, cowbell.calculateProfit());
    }
}
