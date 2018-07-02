import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Chris's Candy Floss", "Chris", "Space 14");
    }

    @Test
    public void canGetName(){
        assertEquals("Chris's Candy Floss", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Chris", candyFlossStall.getOwnership());
    }

    @Test
    public void canGetParkingSpace(){
        assertEquals("Space 14", candyFlossStall.getParkingSpace());
    }



}