package com.company;

/**
 * Created by youpengfei on 15/10/8.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode thisNode=this;
        String result="";
        while (thisNode!=null){
            result+=thisNode.val+"-";
            thisNode=thisNode.next;
        }
        return result;
    }
}
