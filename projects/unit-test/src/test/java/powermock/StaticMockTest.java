package powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * 静态 Mock
 */
@RunWith(PowerMockRunner.class)
// 静态方法，必须提前 Prepare
@PrepareForTest(Dog.class)
public class StaticMockTest {

    @Test
    public void mock1Test() {
        // 模拟前
        assertEquals(10, Dog.getIntTen());

        // 模拟类所有静态方法
        mockStatic(Dog.class);
        // 打桩
        when(Dog.getIntTen()).thenReturn(11);
        assertEquals(11, Dog.getIntTen());
        // 未打桩的方法，返回 null
        assertNull(Dog.getHello());

        // 校验：某个静态方法被调用了（默认 1 次）
        verifyStatic(Dog.class);
        Dog.getIntTen();

        verifyStatic(Dog.class);
        Dog.getHello();
    }
}
