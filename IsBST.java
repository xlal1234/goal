public boolean isBST(TreeNode root) {
	if(root == null) {
		return true;
	}
	return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
private boolean helper(TreeNode root, int left, int right) {
	if(root == null ) {
		return true;
	}
	if(root.key <= left || root.key >= right) {
		return false;
	}
	return helper(root.left, left, root.key) && helper(root.right, root.key, right);
}

//sol2 not recommended since use global variable
class Solution {
	private int lastSeen = Integer.MIN_VALUE;
	public boolean isBST(TreeNode root) {
		lastSeen = Integer.MIN_VALUE;
		return inOrder(root);
	}
	private boolean inOrder(TreeNode root) {
		if (root == null) return true;
		boolean isBST = inOrder(root.left);
		if(!isBST) return false;
		if(root.value <= lastSeen) return false;
		lastSeen = root.value;
		return inOrder(root.right);
	}
}