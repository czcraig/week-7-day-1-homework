import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Dave's Dodgems");
    }

    @Test
    public void canGetName(){
        assertEquals("Dave's Dodgems", dodgems.getName());
    }




}