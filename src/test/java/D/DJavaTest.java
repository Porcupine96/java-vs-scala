package D;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DJavaTest {

    private DJava dJava;
    private DJava.Color rgbColor;
    private DJava.Color colorWithUrl;
    private DJava.Color unsupportedColor;

    @Before
    public void setUp() throws Exception {
        dJava = new DJava();
        rgbColor = new DJava.ColorRGB(10, 20, 30);
        colorWithUrl = new DJava.ColorWithUrl("red", "http://colors.com/red");
        unsupportedColor = new UnsupportedColor();
    }

    @Test
    public void colorAsStringShouldWorkForColorRGB() throws Exception {
        assertEquals("10 20 30", dJava.colorAsString(rgbColor));
    }

    @Test
    public void colorAsStringShouldWorkForColorWithUrl() throws Exception {
        assertEquals("red", dJava.colorAsString(colorWithUrl));
    }

    @Test(expected = IllegalArgumentException.class)
    public void colorAsStringShouldTrowAnExceptionForAUnsupportedColor() throws Exception {
        dJava.colorAsString(unsupportedColor);
    }

    private class UnsupportedColor implements DJava.Color {
        /* nothing interesting here */
    }

}