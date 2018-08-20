public class MergeSort{
	public int[] mergeSort(int[] array){
		if(array == null){
			return array;
		}
		int[] temp = new int[array.length];
		mergeSort(array, temp, 0, array.length-1);
		return array;
	}
	private void mergeSort(int[] array, int[] temp, int left, int right){
		if(left >= right){
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array, temp, left, mid);
		mergeSort(array, temp, mid+1, right);
		merge(array, temp, left, mid, right);
	}
	private void merge(int[] array, int[] temp, int left, int mid, int right){
		for(int i = left, i <= right; i++){
			temp[i] = array[i];
		}
		int leftIndex = left;
		int rightIndex = mid + 1;
		while (leftIndex <= mid && rightIndex <= right) {
			if(temp[leftIndex] <= temp[rightIndex]) {
				array[left++] = temp[leftIndex++];
			} else {
				array[left++] = temp[rightIndex++];
			}
		}
		while(leftIndex <= mid) {
			array[left++] = temp[leftIndex++];
		}
	}
}