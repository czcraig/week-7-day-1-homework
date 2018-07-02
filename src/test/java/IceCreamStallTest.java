import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Iona's IceCream", "Iona", "Space 15");
    }

    @Test
    public void canGetName(){
        assertEquals("Iona's IceCream", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Iona", iceCreamStall.getOwnership());
    }

    @Test
    public void canGetParkingSpace(){
        assertEquals("Space 15", iceCreamStall.getParkingSpace());
    }



}