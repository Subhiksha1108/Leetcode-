class Solution {
    public int pairSum(ListNode head) {
ListNode s=head;
ListNode f=head;
while(f!=null && f.next!=null)
{
    s=s.next;
    f=f.next.next;
}
ListNode prev=null;
ListNode next=null;
while(s!=null)
{
    next=s.next;
    s.next=prev;
    prev=s;
    s=next;
}
int sum=0;


while(prev!=null)
{
    
    sum=Math.max(sum,head.val+prev.val);
    head=head.next;
    prev=prev.next;
}
        return sum;
    }
}