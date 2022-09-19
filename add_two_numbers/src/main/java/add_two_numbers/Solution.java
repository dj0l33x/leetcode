package add_two_numbers;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tempChunk = 0;
        ListNode res = new ListNode();
        addLists(l1, l2, res, tempChunk);
        return res;
    }

    private void addLists(final ListNode l1, final ListNode l2, ListNode res, int tempChunk) {
        int tempRes = getVal(l1) + getVal(l2) + tempChunk;
        if (tempRes > 9) {
            tempChunk = 1;
            tempRes = tempRes % 10;
        } else {
            tempChunk = 0;

        }
        res.val = tempRes;
        res.next = new ListNode();
        if (getNextNode(l1) != null || getNextNode(l2) != null) {
            addLists(getNextNode(l1), getNextNode(l2), getNextNode(res), tempChunk);
        } else if (tempChunk > 0) {
            res.next = new ListNode(tempChunk);
        } else {
            res.next = null;
        }
    }

    private int getVal(final ListNode l) {
        return l == null ? 0 : l.val;
    }

    private ListNode getNextNode(ListNode node) {
        return node == null ? null : node.next;
    }
}