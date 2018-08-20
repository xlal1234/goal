//1->2->3->null     remove(2)  1->3->null

public class Solution{
	ListNode remove(ListNode head, int value){
		//head == null
		if(head == null){
			return null;
		}else if(head.value == value){
			//remove head
			return head.next;
		}
		ListNode cur = head;
		while(cur.next != null && cur.next.value != value){
			cur = cur.next;
		}
		if(cur.next != null){
			cur.next = cur.next.next;
		}
		return head;
	}
}