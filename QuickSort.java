class QuickSort {
	public void quickSort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		quickSort(array, 0, array.length - 1);
	}
	private void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		Random rand = new Random();
		int pivotIndex = left + rand.nextInt(right - left + 1);
		swap(array, pivotIndex, right);
		int l = left, r = right - 1;
		while(l <= r) {
			if(array[l] <= array[right]) {
				l++;
			} else {
				swap(array, l, r);
				r--;
			}
		}
		swap(array, l, right);
		quickSort(array, left, l - 1);
		quickSort(array, l + 1, right);
	}
	private void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}