import org.junit.*;

import static org.junit.Assert.*;

public class TestJunit {

    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
        assertEquals("ok", "not ok");
    }
}
