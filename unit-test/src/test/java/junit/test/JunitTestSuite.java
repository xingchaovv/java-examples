package junit.test;

import junit.test.TestJunit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit.class,
})
public class JunitTestSuite {
}
