package path_sum_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void firstCase() {
        int sum = 22;
        TreeNode input = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                new TreeNode(5,
                                        null,
                                        new TreeNode(0)),
                                new TreeNode(1))));

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(5, 4, 11, 2),
                Arrays.asList(5, 8, 4, 5, 0));
        List<List<Integer>> actual = solution.pathSum(input, sum);
        assertStructures(expected, actual);
    }

    @Test
    public void secondCase() {
        int sum = -5;
        TreeNode input = new TreeNode(-2, null, new TreeNode(-3));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, -3));
        List<List<Integer>> actual = solution.pathSum(input, sum);
        assertStructures(expected, actual);
    }

    @Test
    public void thirdCase() {
        int sum = 2;
        TreeNode input = new TreeNode(1,
                new TreeNode(-2,
                        new TreeNode(1,
                                new TreeNode(-1),
                                null),
                        new TreeNode(3)),
                new TreeNode(-3,
                        new TreeNode(-2),
                        null));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, -2, 3));
        List<List<Integer>> actual = solution.pathSum(input, sum);
        assertStructures(expected, actual);
    }


    void assertStructures(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertLists(expected.get(i), actual.get(i));
        }
    }

    void assertLists(List<Integer> expected, List<Integer> actual) {
        assertTrue(actual.size() == expected.size() &&
                actual.containsAll(expected) &&
                expected.containsAll(actual));
    }
}