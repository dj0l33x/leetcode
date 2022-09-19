package longest_palindromic_substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        final String actual = solution.longestPalindrome("aba");
        assertEquals("aba", actual);
    }

    @Test
    public void case2() {
        final String actual = solution.longestPalindrome("abcdca");
        assertEquals("cdc", actual);
    }

    @Test
    public void case3() {
        final String actual = solution.longestPalindrome("abcdcqwertrewqa");
        assertEquals("qwertrewq", actual);
    }
}