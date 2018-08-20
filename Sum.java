public class Solution {
  public int sum(int[][] array) {
    // Write your solution here
    int res = 0;
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[0].length; j++){
        res += array[i][j];
      }
    }
    return res;
  }
}