package binary_tree_paths;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null)
            process(root, "", result);
        return result;
    }

    void process(TreeNode node, String s, List<String> result) {
        s += node.val;
        if (node.left == null && node.right == null)
            result.add(s);

        if (node.left != null)
            process(node.left, s + "->", result);

        if (node.right != null)
            process(node.right, s + "->", result);
    }
}