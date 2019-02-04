package regions_cut_by_slashes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    final Solution solution = new Solution();

    @Test
    public void firstCase() {
        String[] input = {" /", "/ "};
        assertEquals(2, solution.regionsBySlashes(input));
    }

    @Test
    public void secondCase() {
        String[] input = {" /", "  "};
        assertEquals(1, solution.regionsBySlashes(input));
    }

    @Test
    public void thirdCase() {
        String[] input = {"/"};
        assertEquals(2, solution.regionsBySlashes(input));
    }

    @Test
    public void forthCase() {
        String[] input = {"\\/", "/\\"};
        assertEquals(4, solution.regionsBySlashes(input));
    }

    @Test
    public void fifthCase() {
        String[] input = {"/\\", "\\/"};
        assertEquals(5, solution.regionsBySlashes(input));
    }

    @Test
    public void sixthCase() {
        String[] input = {"//", "/ "};
        assertEquals(5, solution.regionsBySlashes(input));
    }
}