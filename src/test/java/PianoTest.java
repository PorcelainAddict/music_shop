import musical_shoppe.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Bösendorfer", "Pearly White", 3000, 300000, 88);
    }

    @Test
    public void hasModel() {
        assertEquals("Bösendorfer", piano.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Pearly White", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Percussion", piano.getType());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("pia pia piaaannnnoooo piaaaannoooo piiaaaannnoooo", piano.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(3000, piano.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(300000, piano.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(297000, piano.calculateProfit());
    }
}
