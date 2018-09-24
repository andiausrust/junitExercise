import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class ...");
    }

    @Before
    public void before() {
        System.out.println("before test ...");
    }

    @Test
    public void test1(){
        System.out.println("tst1 executed");
    }

    @Test
    public void test2(){
        System.out.println("tst2 executed");
    }

    @After
    public void teardown() {
        System.out.println("after test ...");
    }
}
