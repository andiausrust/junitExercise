import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();


    @Test
    public void testtruncateAInFirst2Positions_AInfirst2Position() {
        // AADC => CD   ACD => CD   CDEF => CDEF   CDAA => CDAA
        // assertEquals - first value expected second value result
        // only testing one condition
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

        /*
        StringHelper helper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        assertEquals(expected, actual);*/
    }

    @Test
    public void testtruncateAInFirst2Positions2_AInFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testtruncateAinFirst2_Positions3_noA(){
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    // ABCD => false, ABAB = true, AB => true, A => false
    @Test
    public void testTwoFirstCharactersEqualLastTwoCharacters () {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testTwoFirstCharactersEqualLastTwoCharacters2 () {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}