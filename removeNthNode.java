package Leetcode;

/**
 * Created by csj on 2015/12/16.
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return head;
        if(head.next==null)return null;
        ListNode end=head,before=head,after=head.next;
        ListNode target = head; //working pointer
        for(int i=0;i<n;i++)end = end.next;
        if(end.next!=null){
            target=target.next;
            after=after.next;
            end=end.next;
        }
        while(end.next!=null){
            target=target.next;
            after=after.next;
            end=end.next;
            before=before.next;

        }

        return head;
    }
}
