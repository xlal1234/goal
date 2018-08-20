public void mergeSort(int[] array){
	if(array == null || array.length ==  0) {
		return;
	}
	mergeSort(array, 0, array.length);
}
private void mergeSort(int[] array, int left, int right) {
	if(leftr >= right) {
		return;
	}
	mergeSort(array, left, mid);
	mergeSort(array, mid + 1, right);
	merge(array, left, mid, right);
}
private void merge(int[] array, int left, int mid, int right) {
	int[] helper = new int[array.length];
	for(int i = 0; i <= array.length; i++) {
		helper[i] = array[i];
	}
	int i = left, j = mid + 1, k = left;
	while(i <= mid && j <= right) {
		if(helper[i] <= helper[j]) {
			array[k++] = helper[i++]; 
		} else {
			array[k++] = helper[j++];
		}
	}
	while (i <= mid) {
		array[k++] = helper[i++];
	}
}