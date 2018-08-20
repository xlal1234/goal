public class Solution {
  public int[] search(int[][] matrix, int target) {
    // Write your solution here
    int[] res = {-1, -1};
    int row = matrix.length;
    int col = matrix[0].length;
    int left = 0, right = row * col - 1;
    if(row == 0 || col == 0) {
      return res; 
    }
    while( left <= right ) {
        int mid = left + (right - left) / 2;
        int rowIndex = mid / col;
        int colIndex = mid % col;
        if(matrix[rowIndex][colIndex] == target) {
            res[0] = rowIndex;
            res[1] = colIndex;
            return res;
        } else if (matrix[rowIndex][colIndex] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return res;
  }
}