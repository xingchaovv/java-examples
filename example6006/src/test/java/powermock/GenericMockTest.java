package powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * 一般 Mock
 */
public class GenericMockTest {

    @Test
    public void mock1Test() {
        Dog dog = mock(Dog.class);
        when(dog.getAddress()).thenReturn("Tianjin");
        assertEquals("Tianjin", dog.getAddress());
    }
}
