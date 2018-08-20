public class Solution {
  public boolean isSymmetric(TreeNode root) {
    // Write your solution here
    return isSymmetric(root, root);
  }
  private boolean isSymmetric(TreeNode A, TreeNode B) {
      if(A == null && B == null) return true;
      if(A == null || B == null) return false;
      return ( A.key == B.key ) 
        && isSymmetric(A.left, B.right) 
        && isSymmetric(A.right, B.left);
  }
}