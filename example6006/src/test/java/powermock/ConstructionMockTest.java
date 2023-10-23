package powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.*;
import static org.junit.Assert.*;

/**
 * 构造方法 Mock
 */
// Mock 构建，必须预先 Prepare
@RunWith(PowerMockRunner.class)
@PrepareForTest(Dog.class)
@PowerMockIgnore({"javax.management.*", "javax.script.*"})
public class ConstructionMockTest {

    /**
     * Mock 一个全模拟实例
     */
    @Test
    public void mock1Test() throws Exception {
        Dog normalDog = new Dog();
        normalDog.setName("WangCai");
        assertEquals("WangCai", normalDog.getName());

        // 先构建 Mock 对象
        Dog mockDog = mock(Dog.class);
        // Mock 方法
        when(mockDog.getName()).thenReturn("WangWang");

        // 预期实力例化时返回 Mock
        whenNew(Dog.class).withNoArguments().thenReturn(mockDog);

        Dog fakeDog = new Dog();
        assertEquals("WangWang", fakeDog.getName());
    }

    /**
     * Mock 一个 Spy 实例
     */
    @Test
    public void mock2Test() throws Exception {
        Dog normalDog = new Dog();
        normalDog.setName("WangCai");
        assertEquals("WangCai", normalDog.getName());

        // 先构建 Spy 对象
        Dog mockDog = spy(normalDog);
        assertEquals("WangCai", mockDog.getName());

        // Mock 方法
        when(mockDog.getName()).thenReturn("WangWang");

        // 预期实力例化时返回 Mock
        whenNew(Dog.class).withNoArguments().thenReturn(mockDog);

        Dog fakeDog = new Dog();
        assertEquals("WangWang", fakeDog.getName());
    }
}
