package Leetcode;

/**
 * Created by csj on 2016/1/8.
 */



public class mergeTwoLists {
    ListNode newNode;
    ListNode result=newNode;
    public ListNode Solution(ListNode l1,ListNode l2){

        if(l1==null)return l2;
        else if(l2==null)return l1;
        while(l1.next!=null&&l2.next!=null){
            newNode.next = l1.val>l2.val? l1:l2;
            l1=l1.val>l2.val? l1.next:l1;
            l2=l1.val>l2.val? l2:l2.next;
        }
        if(l1.next!=null){
            while(l1.next!=null){
                newNode.next=l1.next;
            }
        }
        else if(l2.next!=null){
            while(l2.next!=null){
                newNode.next=l1.next;
            }
        }
        return newNode;
    }
}
