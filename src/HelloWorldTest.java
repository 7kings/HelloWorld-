package src;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class WorldTest {


    @Test
    public void greetResultsInHello() {
        HelloWorld world = new HelloWorld();
        assertEquals("Hello worrld!", HelloWorld.greet());
    }


}