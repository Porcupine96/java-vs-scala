package A;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AJavaTest {

    @Test
    public void aClassShouldHaveAWorkingConstructorGetterAnSetter() throws Exception {
        AJava a = new AJava(7);
        assertEquals(7, a.getX());
        a.setX(5); // immutability? :(
        assertEquals(5, a.getX());
    }

}