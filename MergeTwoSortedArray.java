public class Solution {
	public int[] merge(int[] A, int[] B) {
		int[] helper = new int[A.length + B.length];
	    int i = A.length - 1;
	    int j = B.length - 1;
	    int index = i + j + 1;
	     while (i >= 0 && j >= 0) {
	         if (A[i] > B[j]) {
	             helper[index--] = A[i--];
	         } else {
	             helper[index--] = B[j--];
	         }
	     }
	     while (i >= 0) {
	         helper[index--] = A[i--];
	     }
	     while (j >= 0) {
	         helper[index--] = B[j--];
	     }
	    return helper;
	}
}

//正序
public class Solution {
  public int[] merge(int[] A, int[] B) {
    // Write your solution here
    int[] helper = new int[A.length + B.length];
    int i = 0, j = 0, index = 0;
     while (i <= A.length - 1 && j <= B.length - 1) {
         if (A[i] < B[j]) {
             helper[index++] = A[i++];
         } else {
             helper[index++] = B[j++];
         }
     }
     while (i <= A.length - 1) {
         helper[index++] = A[i++];
     }
     while (j <= B.length - 1) {
         helper[index++] = B[j++];
     }
    return helper;
  }
}