import enemy.stuff.Ballrog;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallrogTest {

    Ballrog ballrog;

    @Before
    public void before(){
        ballrog = new Ballrog();
    }

    @Test
    public void canTakeDamage(){
        ballrog.takeDamage(8);
        assertEquals(10, ballrog.getHealth());
    }


}
