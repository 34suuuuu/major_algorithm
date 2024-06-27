package A7이분탐색;

import java.util.Arrays;

public class B2Basic2 {
	public static void main(String[] args) {
	// 	target을 찾되,
	// 	target이 없으면 target보다 큰 값중에 첫번째 값을 찾아라
		int[] arr = {1, 3, 4, 5, 7, 8, 9};
		int target = 6;

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		int idx = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] >= target) {
				end = mid - 1;
				idx = mid;
				continue;
			}
			start = mid + 1;
		}
		System.out.println(idx);

	// 	가까운값 찾기
		int[] arr2 = {10, 20, 30};
		System.out.println(Arrays.binarySearch(arr2, 35));
		System.out.println(Arrays.binarySearch(arr2, 9));
		System.out.println(Arrays.binarySearch(arr2, 25));

		int idx2 = Arrays.binarySearch(arr2, target);
		if (idx2 < 0) {
			// 큰값 찾아라하면 -1
			// 작은값 찾아라하면 -2
			System.out.println(Math.abs(idx2) - 1);
		} else {
			System.out.println(idx2);
		}


	}
}
