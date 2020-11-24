import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import static org.powermock.api.mockito.PowerMockito.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CollaboratorWithFinalMethods.class, CollaboratorWithStaticMethods.class})
public class CollaboratorWithFinalMethodsTest {

    @Test
    public void helloMethodTest() throws Exception {
        CollaboratorWithFinalMethods mock = mock(CollaboratorWithFinalMethods.class);
        whenNew(CollaboratorWithFinalMethods.class).withNoArguments().thenReturn(mock);

        CollaboratorWithFinalMethods collaborator = new CollaboratorWithFinalMethods();
        when(collaborator.helloMethod()).thenReturn("Hello Bong!");

        System.out.println(collaborator.helloMethod());
        System.out.println(collaborator.getTimeDesc());
    }

    @Test
    public void helloMethod2Test() throws Exception {
        CollaboratorWithFinalMethods collaborator = new CollaboratorWithFinalMethods();
        collaborator = spy(collaborator);
        when(collaborator.helloMethod()).thenReturn("Hello Bong!");
        System.out.println(collaborator.helloMethod());
        System.out.println(collaborator.getTimeDesc());
    }

    @Test
    public void getTimeDescTest() throws Exception {
        CollaboratorWithFinalMethods collaborator = PowerMockito.mock(CollaboratorWithFinalMethods.class);
        when(collaborator.getTimeDesc()).thenReturn("2020-01-01");
        System.out.println(collaborator.getTimeDesc());
    }

    @Test
    public void staticMockTest() {
        mockStatic(CollaboratorWithStaticMethods.class);
        when(CollaboratorWithStaticMethods.firstMethod(Mockito.anyString()))
                .thenReturn("Hello Baeldung!");
        when(CollaboratorWithStaticMethods.secondMethod()).thenReturn("Nothing special");

        doThrow(new RuntimeException()).when(CollaboratorWithStaticMethods.class);
        CollaboratorWithStaticMethods.thirdMethod();

        String firstWelcome = CollaboratorWithStaticMethods.firstMethod("Whoever");
        String secondWelcome = CollaboratorWithStaticMethods.firstMethod("Whatever");
        assertEquals("Hello Baeldung!", firstWelcome);
        assertEquals("Hello Baeldung!", secondWelcome);
    }
}
