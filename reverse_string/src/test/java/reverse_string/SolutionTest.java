package reverse_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void firstCase() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] result = {'o', 'l', 'l', 'e', 'h'};
        solution.reverseString(input);
        assertArrayEquals(result, input);
    }

    @Test
    public void secondCase() {
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] result = {'h', 'a', 'n', 'n', 'a', 'H'};
        solution.reverseString(input);
        assertArrayEquals(result, input);
    }
}