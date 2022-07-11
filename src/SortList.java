import java.util.PriorityQueue;

public class SortList {
    //https://leetcode.com/problems/sort-list/
//    public ListNode sortList(ListNode head) {
//        if(head==null || head.next==null){
//            return head;
//        }
//
//        PriorityQueue<Integer> q=new PriorityQueue<>();
//
//        ListNode curr=head;
//
//        while(curr!=null){
//            q.add(curr.val);
//            curr=curr.next;
//        }
//        curr=head;
//        while(curr!=null && !q.isEmpty()){
//            curr.val=q.poll();
//            curr=curr.next;
//        }
//        return head;
//    }
}
