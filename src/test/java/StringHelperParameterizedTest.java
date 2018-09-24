import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String output) {
        this.input = input;
        this.expectedOutput = output;
    }

    @Parameterized.Parameters
    public static Collection testConditions(){

    String expectedOutput [][] = {
            {
                "AACD", "CD"
            },
            {
                "ACD", "CD"
            }
        };
        return Arrays.asList(expectedOutput);
    }


    @Test
    public void testtruncateAInFirst2Positions() {
        assertEquals(expectedOutput,
                helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testtruncateAInFirst2Positions2_AInFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
}