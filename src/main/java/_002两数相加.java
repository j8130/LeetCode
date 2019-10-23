/**
 * @Author: jsy
 * @Date: 2019/10/9 13:30
 */
/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */

import java.util.Collections;
import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution002 {

    public static void main(String[] args) {
        LinkedList<Integer> node1 = new LinkedList<>();
        LinkedList<Integer> node2 = new LinkedList<>();
        node1.add(3);
        node1.add(4);
        node1.add(2);

        node2.add(4);
        node2.add(6);
        node2.add(5);

    }

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        int m = 0;
        int n = 0;
        Collections.reverse(l1);
        Collections.reverse(l2);

        // i是幂
        int i = 0;
        for (Integer integer : l1) {
            double v = integer * Math.pow(10, i);
            i++;

        }

        return null;

    }
}