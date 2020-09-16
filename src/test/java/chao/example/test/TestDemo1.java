package chao.example.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDemo1 {

    @Test
    public void hello() {
        String str = "Hello";
        assertEquals("Hello", str);
    }
}
