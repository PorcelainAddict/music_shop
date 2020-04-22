import musical_shoppe.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Martin","Dynamite Beige", 100, 2000, 6);
    }

    @Test
    public void hasModel() {
        assertEquals("Martin", guitar.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Dynamite Beige", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("cries in guitar", guitar.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(100, guitar.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(2000, guitar.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(1900, guitar.calculateProfit());
    }
}
