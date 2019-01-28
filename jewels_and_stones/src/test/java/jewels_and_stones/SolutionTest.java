package jewels_and_stones;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void firstCase() {
        final String J = "aA";
        final String S = "aAAbbbb";
        assertTrue(3 == solution.numJewelsInStones(J, S));
    }

    @Test
    public void secondCase() {
        final String J = "z";
        final String S = "ZZ";
        assertTrue(0 == solution.numJewelsInStones(J, S));
    }
}