import musical_shoppe.Triangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before(){
        triangle = new Triangle("Silver", "Tinga-Linga's", 30, 300);
    }

    @Test
    public void hasModel() {
        assertEquals("Tinga-Linga's", triangle.getBrand());
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", triangle.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Idiophone", triangle.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("tinga-ling", triangle.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(30, triangle.getCost());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(300, triangle.getRrp());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(270, triangle.calculateProfit());
    }

}
