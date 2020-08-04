package com.company;

public class MergeLists {
    public static ListNode sortList2(ListNode head){
        if(head==null || head.next ==null){
            return head;
        }
        ListNode prev=null;
        ListNode slow=head , fast= head;
        while(fast!=null && fast.next != null){
            prev=slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        prev.next= null;
        ListNode ln1 = sortList2(head);
        ListNode ln2 = sortList2(slow);
        ListNode resultLN = mergeList(ln1,ln2);
        return resultLN;
    }

    public static ListNode mergeList(ListNode l1,ListNode l2){
        ListNode temp = new ListNode();
        ListNode resultList = temp;

        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }else{
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
        }
        ListNode remList = l1==null ? l2:l1;
        while (remList != null) {
            temp.next = new ListNode(remList.val);
            remList = remList.next;
            temp = temp.next;
        }
        return resultList.next;
    }
}
