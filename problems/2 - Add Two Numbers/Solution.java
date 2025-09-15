
// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3,l4=l3=null;
        ListNode a,b;
        a=l1;
        b=l2;
        int carry=0;
        for(;a!=null || b!=null;)
        {
            // if(carry==0)
            // {
                int sum =carry;
                if(a!=null){
                 sum+=a.val;
                 a=a.next;
                }
                 if(b!=null){
                 sum+=b.val;
                 b=b.next;
                 }
            int temp=sum%10;
            ListNode t1= new ListNode(temp);
            if(l3==null)
            l4=l3=t1;
            else 
            {
                l3.next=t1;
                l3= l3.next;
            }
            carry=sum/10;
           
        }
        if (carry!=0)
        {
            ListNode t1= new ListNode(carry);
            l3.next=t1;
        }
        return l4;
    }
}