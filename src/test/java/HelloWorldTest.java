import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKaran () {
        //Arrange
        HelloWorld helloword = new HelloWorld();

        //Act
        String autualResult = helloword.greeting("Toey");

        //Assert
        assertEquals("Hello Toey", autualResult);
    }
}
