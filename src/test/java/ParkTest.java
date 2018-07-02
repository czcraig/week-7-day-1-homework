import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Paul's Park");
    }

    @Test
    public void canGetName(){
        assertEquals("Paul's Park", park.getName());
    }




}