import musical_shoppe.Kazoo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KazooTest {

    Kazoo kazoo;

    @Before
    public void before(){
        kazoo = new Kazoo("Enoi's", "Metallic", 4, 20);
    }

    @Test
    public void hasModel() {
        assertEquals("Enoi's", kazoo.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Metallic", kazoo.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("mirliton", kazoo.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("ddddzzzzzoooooooooo", kazoo.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(4, kazoo.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(20, kazoo.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(16, kazoo.calculateProfit());
    }
}
