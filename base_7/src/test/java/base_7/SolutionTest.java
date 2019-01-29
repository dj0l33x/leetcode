package base_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void firstCase() {
        int input = 100;
        String result = "202";
        assertEquals(result, solution.convertToBase7(input));
    }

    @Test
    public void secondCase() {
        int input = -7;
        String result = "-10";
        assertEquals(result, solution.convertToBase7(input));
    }

    @Test
    public void thirdCase() {
        int input = 6;
        String result = "6";
        assertEquals(result, solution.convertToBase7(input));
    }

    @Test
    public void fourthCase() {
        int input = -6;
        String result = "-6";
        assertEquals(result, solution.convertToBase7(input));
    }

    @Test
    public void fifthCase() {
        int input = 49;
        String result = "100";
        assertEquals(result, solution.convertToBase7(input));
    }

}
