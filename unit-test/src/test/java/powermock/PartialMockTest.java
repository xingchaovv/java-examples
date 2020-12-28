package powermock;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.mockito.Mockito;

import static org.powermock.api.mockito.PowerMockito.*;
import static org.junit.Assert.*;

/**
 * 部分 Mock
 */
public class PartialMockTest {

    @Test
    public void mock1Test() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(101);
        list.add(102);

        List<Integer> spyList = spy(list);
        when(spyList.get(0)).thenReturn(200);
        assertEquals(100, (long)list.get(0));
        assertEquals(101, (long)list.get(1));
        assertEquals(200, (long)spyList.get(0));
        assertEquals(101, (long)spyList.get(1));

        when(spyList.get(Mockito.anyInt())).thenReturn(0);
        assertEquals(100, (long)list.get(0));
        assertEquals(101, (long)list.get(1));
        assertEquals(0, (long)spyList.get(0));
        assertEquals(0, (long)spyList.get(1));
        assertEquals(0, (long)spyList.get(2));
    }
}
