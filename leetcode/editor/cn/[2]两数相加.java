//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        ListNode p = l1;

        // 进位
        int carry = 0;
        while (true) {
            // 计算
            int sum = l1.val + l2.val + carry;
            // 当前位计算结果 = 余数
            p.val = sum % 10;
            // 进位
            carry = sum / 10;

            if (l1.next == null || l2.next == null) {
                if (l1.next != null) {
                    p.next = l1.next;
                    p = p.next;
                    break;
                } else if (l2.next != null) {
                    p.next = l2.next;
                    p = p.next;
                    break;
                } else {
                    // l1 l2都为空 循环结束
                    // 最后的进位
                    if (carry == 1) {
                        p.next = new ListNode(1);
                    } else {
                        p.next = null;
                    }
                    return result;
                }
            } else {
                p = l1.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }

        // l1 l2剩下一个
        if (carry == 1) {
            while (p != null) {
                int sum = p.val + carry;
                p.val = sum % 10;
                carry = sum / 10;

                if (p.next == null) {
                    // 最后的进位
                    if (carry == 1) {
                        p.next = new ListNode(1);
                    }
                    return result;
                } else {
                    p = p.next;
                }
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
