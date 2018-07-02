import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
        public void before(){
        visitor = new Visitor(15, 190, 40);
    }

    @Test
        public void canGetAge(){
        assertEquals(15, visitor.getAge(), 0.01);
    }

    @Test
        public void canGetHeight(){
        assertEquals(190, visitor.getHeight(), 0.01);
    }

    @Test
    public void canGetMoney(){
       assertEquals(40, visitor.getMoney(), 0.01);
    }





}
