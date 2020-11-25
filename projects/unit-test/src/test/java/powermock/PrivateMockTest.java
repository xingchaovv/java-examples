package powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * 私有方法 Mock
 */
// 私有方法 Mock，必须预先 Prepare
// Final 方法 Mock，必须预先 Prepare
@RunWith(PowerMockRunner.class)
@PrepareForTest(Dog.class)
@PowerMockIgnore({"javax.management.*", "javax.script.*"})
public class PrivateMockTest {

    @Test
    public void mock1Test() throws Exception {
        Dog normalDog = new Dog();
        assertEquals("Beijing", normalDog.getAddress());

        // Mock
        Dog mockDog = spy(new Dog());
        when(mockDog, "getAddressByPrivate").thenReturn("Tianjin");
        assertEquals("Tianjin", mockDog.getAddress());
    }

    /**
     * Mock Final 方法
     */
    @Test
    public void mockFinalMethodTest() throws Exception {
        Dog normalDog = new Dog();
        assertEquals(20, normalDog.getAge());

        // Mock
        Dog mockDog = spy(new Dog());
        when(mockDog.getAge()).thenReturn(21);
        assertEquals(21, mockDog.getAge());
    }
}
