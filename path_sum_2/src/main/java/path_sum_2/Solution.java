package path_sum_2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> internalList = new ArrayList<>();
        if (root != null)
            process(root, sum, resultList, internalList, 0);
        return resultList;
    }

    void process(TreeNode node, int sum, List<List<Integer>> resultList, List<Integer> internalList, int integersSum) {
        List<Integer> integers = new ArrayList<>(internalList);
        integers.add(node.val);

        if (node.left != null)
            process(node.left, sum, resultList, integers, integersSum + node.val);

        if (node.right != null)
            process(node.right, sum, resultList, integers, integersSum + node.val);

        if (node.left == null && node.right == null && integersSum + node.val == sum)
            resultList.add(integers);
    }
}
