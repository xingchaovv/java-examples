package junit.usage;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testPrintMessage2() {
        message = "New Word";
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    @Ignore
    public void testPrintMessage3() {
        message = "Ignored";
        assertEquals(message, messageUtil.printMessage());
    }

    @Test(timeout = 10)
    public void testPrintMessage4() throws InterruptedException {
        Thread.sleep(5);
    }
}
