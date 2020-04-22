import musical_shoppe.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before(){
        bass = new Bass("Fender", "Aqua", 4, 300, 500);
    }

    @Test
    public void hasBrand() {
        assertEquals("Fender", bass.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Aqua", bass.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("String", bass.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, bass.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Fuuuuuuuuuuuuunky dulcet tones fulls the room", bass.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(300, bass.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(500, bass.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200, bass.calculateProfit());
    }


}
