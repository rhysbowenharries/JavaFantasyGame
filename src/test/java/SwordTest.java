import elements.Element;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword();
    }

    @Test
    public void hasElement(){
        assertEquals(Element.STEAL, sword.getElement());
    }
}
