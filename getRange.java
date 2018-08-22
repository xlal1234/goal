/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public List<Integer> getRange(TreeNode root, int min, int max) {
    // Write your solution here
    List<Integer> list = new ArrayList<>();
    helper(root, min, max, list);
    return list;
  }
  private void helper(TreeNode root, int min, int max, List<Integer> list) {
      if( root == null ) return;
      if(root.key > min) helper(root.left, min, max, list);
      if(min <= root.key && root.key <= max) {
          list.add(root.key);
      }
      if(root.key < max) helper(root.right, min, max, list);
  }
}
