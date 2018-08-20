public class QuickSort2 {
	public void quickSort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		quickSort(int[] array, 0, array.length - 1);
	}
	private void quickSort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivotIndex = partition(array, left, right);
		quickSort(array, left, pivotIndex - 1);
		quickSort(array, pivotIndex + 1, right);
	}
	private int partition(int[] array, int left, int right) {
		int pivotIndex = right;
		int i = left;
		int j = right - 1;
		while(i <= j) {
			if(array[i] < array[pivotIndex]) {
				i++;
			} else if(array[j] >= array[pivotIndex]) {
				j--;
			} else {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		swap(array, i, pivotIndex);
		return i;
	}
	private void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}