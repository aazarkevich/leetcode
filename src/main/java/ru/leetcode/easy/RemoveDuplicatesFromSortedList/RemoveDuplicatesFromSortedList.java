package ru.leetcode.easy.RemoveDuplicatesFromSortedList;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while (temp2 != null) {
            if (temp1.val == temp2.val) {
                temp1.next = temp2.next;
                temp2 = temp2.next;
            } else {
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        System.out.print(head.val);
        ListNode temp = head.next;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
    }

    @Nested
    class RemoveDuplicatesFromSortedListTest {
        @Test
        public void test1() {
            ListNode listNode = new ListNode();
            ListNode listNode1 = new ListNode();
            ListNode listNode2 = new ListNode();
            ListNode listNode3 = new ListNode();
            ListNode listNode4 = new ListNode();
            listNode.val = 1;
            listNode.next = listNode1;
            listNode1.val = 1;
            listNode1.next = listNode2;
            listNode2.val = 2;
            listNode2.next = listNode3;
            listNode3.val = 3;
            listNode3.next = listNode4;
            listNode4.val = 3;
            printListNode(listNode);
            System.out.println();
            printListNode(deleteDuplicates(listNode));
        }
    }
}