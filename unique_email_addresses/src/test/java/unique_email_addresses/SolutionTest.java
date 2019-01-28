package unique_email_addresses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void firstCase() {
        String[] input = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        assertEquals(2, solution.numUniqueEmails(input));
    }
}