package com.java.addTwoNumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result ;
        ListNode currentHead;
        int carryOver = 0;
        while(l1 != null || l2 != null){
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 !=null ? l2.val : 0;
            int temp = carryOver + l1.val + l2.val;
            result.val = (temp ) < 10 ? temp : temp % 10;
            result.next = currentHead;
            carryOver = temp/10;
        }
        return result;
    } 
}
