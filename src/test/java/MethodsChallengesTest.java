import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsChallengesTest {

    @Test
    public void testAddition_when15and17_then32(){
        int a = 15;
        int b = 17;
        int actual = MethodsChallenges.addition(a,b);
        int expected = 32;
        assertEquals(expected,actual);
    }
    @Test
    public void isEven_when7_isEven(){
        boolean actual = MethodsChallenges.isEven(7);

        assertFalse(actual);
    }

}