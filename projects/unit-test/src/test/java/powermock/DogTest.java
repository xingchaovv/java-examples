package powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Dog.class)
public class DogTest {

    @Test
    public void varietyCountTest() {
        // 模拟前
        assertEquals(10L, Dog.varietyCount());

        // 开启静态方法模拟
        mockStatic(Dog.class);
        when(Dog.varietyCount()).thenReturn(11L);
        assertEquals(11, Dog.varietyCount());

        // 校验：静态调用 2 次
        verifyStatic(Dog.class, Mockito.times(2));
        Dog.varietyCount();
        Dog.varietyCount();
    }
}
