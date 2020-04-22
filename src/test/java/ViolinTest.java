import musical_shoppe.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Cecilio", "Electric Pink", 60, 700, 4);
    }

    @Test
    public void hasModel() {
        assertEquals("Cecilio", violin.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Electric Pink", violin.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("String", violin.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("room fills with melancholy", violin.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(60, violin.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(700, violin.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(640, violin.calculateProfit());
    }
}
