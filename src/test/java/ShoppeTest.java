import Accessories.Drumsticks;
import Behaviours.ISell;
import musical_shoppe.Kazoo;
import musical_shoppe.Shoppe;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShoppeTest {
    Shoppe shoppe;
    ISell item;

    @Before
    public void before(){
        shoppe = new Shoppe("Hunners o' Music hings");
        item = new Drumsticks("Vics", 3, 6);
    }

    @Test
    public void hasName(){
        assertEquals("Hunners o' Music hings", shoppe.getName());
    }

    @Test
    public void hasNaeStock(){
        assertEquals(0, shoppe.stockCount());
    }

    @Test
    public void addToStock(){
        shoppe.addToStock(item);
        assertEquals(1, shoppe.stockCount());
    }

    @Test
    public void canOrderKazoo(){
        item = new Kazoo("E-noi's Kazoo", "Yellow", 5, 10);
        shoppe.addToStock(item);
        assertEquals(1, shoppe.stockCount());
    }

    @Test
    public void canRemoveItem(){
        shoppe.addToStock(item);
        shoppe.removeFromStock(item);
        assertEquals(0, shoppe.stockCount());
    }
}
