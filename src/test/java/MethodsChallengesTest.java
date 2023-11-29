import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsChallengesTest {

    @Test
    public void additionTest_when15and17_then32() {
        // GIVEN
        int a = 15;
        int b = 17;

        // WHEN
        int actual = MethodsChallenges.addition(a, b);

        // THEN
        assertEquals(32, actual);
    }

    @Test
    public void isEvenTest_when7_thenFalse() {
        // GIVEN
        int a = 7;

        // WHEN
        boolean actual = MethodsChallenges.isEven(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void multiplicationTest_when3and5_then15() {
        // GIVEN
        int a = 3;
        int b = 5;

        // WHEN
        int actual = MethodsChallenges.multiplication(a, b);

        // THEN
        assertEquals(15, actual);
    }

    @Test
    public void convertToUpperCaseTest_whenHallo_Tamana_thenHALLO_TAMANA() {
        // GIVEN
        String a = "Hallo Tamana";

        // WHEN
        String actual = MethodsChallenges.convertToUpperCase(a);

        // THEN
        assertEquals("HALLO TAMANA", actual);
    }

    @Test
    public void checkIfPositiveTest_when0_thenFalse() {
        // GIVEN
        int a = 0;

        // WHEN
        boolean actual = MethodsChallenges.checkIfPositive(a);

        // THEN
        assertFalse(actual);
    }

}