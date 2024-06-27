package A7이분탐색;

import java.util.Arrays;

public class B3입국심사 {
	public static void main(String[] args) {
		System.out.println(solution(6, new int[]{7, 10}));
	}

	public static long solution(int n, int[] times) {
		long answer = 0;

		Arrays.sort(times);
		long left = 0;
		long right = times[times.length - 1] * (long)n / times.length;
		long mid = 0;

		long complete = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			complete = 0;

			for (int i : times) {
				complete += (mid / i);
			}
			if (complete < n) {
				left = mid + 1;
			} else {
				right = mid - 1;
				answer = mid;
			}
		}
		return answer;
	}
}
