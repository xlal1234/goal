public class Solution {
  public int[] sort(int[] array) {
    // Write your solution here
    //handle corner case
    if( array == null || array.length == 0){
        return array;
    }
    //businese logic
    for(int i = 0; i < array.length -1; i++){
      int globalMin = i;
      for(int j = i+1; j < array.length; j++){
        if(array[j] < array[globalMin]){
          globalMin = j;
        }
      }
      swap(array, i, globalMin);
    }
    return array;
  }
  private void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
