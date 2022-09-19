package add_two_numbers;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        final ListNode l1 = new ListNode(2, new ListNode(1));
        final ListNode l2 = new ListNode(2, new ListNode(1));
        assertLists(l1, l2);
    }

    @Test
    public void case2() {
        final ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        final ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        final ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        final ListNode actual = solution.addTwoNumbers(l1, l2);
        assertLists(actual, expected);
    }

    @Test
    public void case3() {
        final ListNode l1 =
            new ListNode(9,
                new ListNode(9,
                    new ListNode(9,
                        new ListNode(9,
                            new ListNode(9,
                                new ListNode(9,
                                    new ListNode(9)))))));
        final ListNode l2 =
            new ListNode(9,
                new ListNode(9,
                    new ListNode(9,
                        new ListNode(9))));

        final ListNode expected =
            new ListNode(8,
                new ListNode(9,
                    new ListNode(9,
                        new ListNode(9,
                            new ListNode(0,
                                new ListNode(0,
                                    new ListNode(0,
                                        new ListNode(1))))))));

        final ListNode actual = solution.addTwoNumbers(l1, l2);
        assertLists(actual, expected);
    }

    private void assertLists(ListNode actual, ListNode expected) {
        while (actual != null || expected != null) {
            assertEquals(actual.val, expected.val);
            actual = actual.next;
            expected = expected.next;
        }
    }
}