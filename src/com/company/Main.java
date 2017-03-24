package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import javafx.collections.transformation.SortedList;

public class Main {

    public static void main(String[] args) {
//        ListNode listNode1 = new ListNode(9);
//        listNode1.next = new ListNode(9);
//        listNode1.next.next = new ListNode(9);
//        listNode1.next.next.next = new ListNode(9);
//        listNode1.next.next.next.next = new ListNode(9);
//        listNode1.next.next.next.next.next = new ListNode(9);
//        listNode1.next.next.next.next.next.next = new ListNode(9);
//        listNode1.next.next.next.next.next.next.next = new ListNode(9);
//        listNode1.next.next.next.next.next.next.next.next = new ListNode(9);
//        listNode1.next.next.next.next.next.next.next.next.next = new ListNode(9);
//
//        ListNode listNode2 = new ListNode(9);
//        listNode2.next = new ListNode(9);
//        listNode2.next.next = new ListNode(9);
//        listNode2.next.next.next = new ListNode(9);
//        listNode2.next.next.next.next = new ListNode(9);
//        listNode2.next.next.next.next.next = new ListNode(9);
//        listNode2.next.next.next.next.next.next = new ListNode(9);
//        listNode2.next.next.next.next.next.next.next = new ListNode(9);
//        listNode2.next.next.next.next.next.next.next.next = new ListNode(9);
//        listNode2.next.next.next.next.next.next.next.next.next = new ListNode(9);
//        final ListNode listNode = addTwoNumbers(listNode1, listNode2);
//        System.out.println(listNode);
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        long oneNumber = 0;
        long oneNumberBit = 1;
        long twoNumber = 0;
        long twoNumberBit = 1;
        while (l1 != null) {
            oneNumber += l1.val * oneNumberBit;
            oneNumberBit = oneNumberBit * 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            twoNumber += l2.val * twoNumberBit;
            twoNumberBit = twoNumberBit * 10;
            l2 = l2.next;
        }
        long resultNumber = oneNumber + twoNumber;
        String resultStr = resultNumber + "";
        final char[] chars = resultStr.toCharArray();

        ListNode temp = null;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == chars.length - 1) {
                result = new ListNode(Integer.valueOf(String.valueOf(chars[i])));
            } else {
                if (temp == null) {
                    result.next = new ListNode(Integer.valueOf(String.valueOf(chars[i])));
                    temp = result.next;
                } else {
                    temp.next = new ListNode(Integer.valueOf(String.valueOf(chars[i])));
                    temp = temp.next;
                }
            }

        }
        return result;

    }

    public static int lengthOfLongestSubstring(String s) {
        final int length = s.length();
        int innerSize = length % 2 == 0 ? length / 2 : length / 2 + 1;
        for (int i = 1; i < innerSize; i++) {

        }
        return length;
    }
}
