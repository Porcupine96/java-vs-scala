package C;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CJavaTest {

    private CJava cJava;
    private List<String> testList;

    @Before
    public void setUp() throws Exception {
        cJava = new CJava();
        testList = IntStream.rangeClosed(1, 100).mapToObj(String::valueOf).collect(Collectors.toList());
        // mapToObj ? :/
    }

    @Test
    public void sumDivBy7PreJava8Test() throws Exception {
        assertEquals(735, cJava.sumDivBy7PreJava8(testList));
    }

    @Test
    public void sumDiv7Java8Test() throws Exception {
        assertEquals(735, cJava.sumDiv7Java8(testList));
    }

}
