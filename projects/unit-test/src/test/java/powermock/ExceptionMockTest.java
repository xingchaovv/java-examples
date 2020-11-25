package powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.powermock.api.mockito.PowerMockito.*;

// 静态方法 Mock，必须预先 Prepare
@RunWith(PowerMockRunner.class)
@PrepareForTest(Dog.class)
@PowerMockIgnore({"javax.management.*", "javax.script.*"})
public class ExceptionMockTest {

    /**
     * Mock 实例抛异常情况
     */
    @Test
    public void mock1Test() {
        Dog dog = mock(Dog.class);
        doThrow(new RuntimeException()).when(dog).getAddress();
        assertThrows(RuntimeException.class, dog::getAddress);
    }

    /**
     * Mock 静态方法抛异常情况
     * TODO 存在问题
     */
    @Test
    public void mockStaticTest() {
        // Mock 类所有静态方法
        mockStatic(Dog.class);
        doThrow(new RuntimeException()).when(Dog.class);
        Dog.getIntTen();
    }
}
