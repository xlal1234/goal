public class Solution {
	public int[] kSmallest(int[] array, int k) {
		if (array.length == 0 || k == 0) {
			return new int[0];
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1.equals(o2)) {
					return 0;
				}
				return o1 > o2 ? -1 : 1;
			}
		});
		for(i = 0; i < array.length; i++) {
			if(i < k) {
				maxHeap.offer(array[i]);
			} else if (array[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.offer(array[i]);
			}
		}
		int[] result = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			result[i] = maxHeap.poll();
		}
		return result
	}
}

// time: O(k + (n-k)log(k))
// k<<n   O(nlog(k))
// k = n/2 O(nlog(n))
// k ~= n  O(n)
// space O(k)
class Solution2{
	public void smallestK(int[] array, int k) {
		//O(n)
		List<Integer> list = new ArrayList<>();
		for(int a : array) {
			list.add(a);
		}
		//O(n)
		Queue<Integer> pq = new PriorityQueue<>(list);

		//O(klogn)
		for(int i = 0; i < k; i++) {
			System.out.println(pq.poll());
		}
	}

}
//O(n+klogn)
//// k<<n   O(n)
// k = n/2 O(nlogn)
// k ~= n  O(nlogn)
// space O(n)
// 
class Solution3{
	//quickSelect  O(n)
	public List<Integer> quickSelect(int[] array, int k) {
		helper(array, k - 1, array.length - 1);
		Lsit<Integer> list = new ArrayList<>();
		for ( int i = 0; i < k; i++) {
			list.add(array[i]);
		}
		return list;
	}
	private void helper(int[] array, int k, int left, int right) {
		if( left >= right) return;
		Random random = new Random();
		int pivotIndex = left + random.nextInt(right - left + 1);
		swap(array, pivotIndex, right);
		int l = left, r = right - 1;
		while(l <= r) {
			if (array[l] < array[right]) {
				l++;
			} else {
				swap(array, l, r);
				r--;
			}
		}
		swap(array, l, right);
		if (k == 1) {
			return;
		} else if (k < 1) {
			helper(array, k, left, l - 1);
		} else {
			helper(array, k, l+1, right);
		}
	}
}