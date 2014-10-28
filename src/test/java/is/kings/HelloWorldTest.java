package is.kings;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class HelloWorldTest {


    @Test
    public void greetResultsInHello() {
        HelloWorld world = new HelloWorld();
        assertEquals("Hello World!", world.greet());
    }


}
