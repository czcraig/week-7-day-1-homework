import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Pete's Playground");
    }

    @Test
    public void canGetName(){
        assertEquals("Pete's Playground", playground.getName());
    }




}
