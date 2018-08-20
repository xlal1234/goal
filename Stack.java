public class ListNode{
	int value;
	ListNode next;
}
public class Stack{
	private ListNode head;
	public Stack() {
		head = new ListNode(0);
		head.next = null;
	}
	public void push(Integer ele) {
		ListNode node = new ListNode(ele);
		head.next = node;
		head = null;
	}
	public Integer pop() {
		if(head == null) {
			return head;
		}
		ListNode prev = head;
		head = head.next;
		head.next = null;
		prev.next = null;
		return prev.value;
	}
	public Integer peek() {
		if(head == null) {
			return null;
		}
		return head.value;
	}
}