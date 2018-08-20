public class Solution {
  public ListNode partition(ListNode head, int target) {
    // Write your solution here
    ListNode dummyL = new ListNode(0);
    ListNode dummyS = new ListNode(0);
    ListNode currL = dummyL;
    ListNode currS = dummyS;
    ListNode curr = head;
    while(curr != null) {
        if(curr.value < target) {
            currS.next = curr;
            curr = curr.next;
            currS = currS.next;
        } else {
            currL.next = curr;
            curr = curr.next;
            currL = currL.next;
        }
    }
    currS.next = dummyL.next;
    currL.next = null;
    return dummyS.next;
  }
}