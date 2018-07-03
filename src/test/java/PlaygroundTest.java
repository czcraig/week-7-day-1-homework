import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("Pete's Playground");
        visitor = new Visitor(16,180,30);
    }

    @Test
    public void canGetName(){
        assertEquals("Pete's Playground", playground.getName());
    }

    @Test
    public void isAllowedTo(Visitor visitor){
        assertEquals(false, playground.isAllowedTo(visitor));
    }




}
