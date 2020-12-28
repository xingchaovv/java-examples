package example.test;

import org.junit.*;

public class TestExecutionProcedure {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }

    @Before
    public void before() {
        System.out.println("in before");
    }

    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void case1() {
        System.out.println("in case1");
    }

    @Test
    public void case2() {
        System.out.println("in case2");
    }
}
