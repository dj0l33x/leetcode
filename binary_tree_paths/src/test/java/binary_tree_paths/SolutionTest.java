package binary_tree_paths;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void firstCase() {
        TreeNode firstLevelLeft = new TreeNode(2, null, new TreeNode(5));
        TreeNode firstLevelRight = new TreeNode(3);
        TreeNode root = new TreeNode(1, firstLevelLeft, firstLevelRight);

        List<String> actual = solution.binaryTreePaths(root);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));
    }

    @Test
    public void secondCase() {
        List<String> actual = solution.binaryTreePaths(null);
        List<String> expected = Collections.emptyList();
        assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));
    }
}