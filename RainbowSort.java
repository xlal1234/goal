public class RainbowSort {
  public int[] rainbowSort(int[] array) {
    // Write your solution here
    if (array == null || array.length <= 1) {
      return array;
    }
    int i = 0, j = 0, k = array.length - 1;
    while (j <= k) {
      if (array[j] == -1) {
        swap(array, i, j);
        i++;
        j++
      } else if (array[j] == 0) {
        j++;
      } else {
        swap(array, j, k);
        k--;
      }
    }
    return array;
  }
  private void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
