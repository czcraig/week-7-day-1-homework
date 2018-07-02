import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Tom's Tobacco", "Tom", "Space 13");
    }

    @Test
    public void canGetName(){
        assertEquals("Tom's Tobacco", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Tom", tobaccoStall.getOwnership());
    }

    @Test
    public void canGetParkingSpace(){
        assertEquals("Space 13", tobaccoStall.getParkingSpace());
    }



}
