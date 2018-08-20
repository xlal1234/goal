public class Solution {
	public ListNode insertNode(ListNode head, int target) {
		if(head == null || target <= head.value) {
			ListNode newNode = new ListNode(target);
			newNode.next = head;
			return newNode;
		}
		ListNode prev = null;
		ListNode cur = head;
		while(cur != null) {
			if(cur.value < target) {
				prev = cur;
				cur = cur.next;
			} else {
				prev.next = new ListNode(target);
				prev.next.next = cur;
				return head;
			}
		}
		prev.next = new ListNode(target);
		return head;
	}
}