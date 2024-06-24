package A1sort;

import java.util.Collections;
import java.util.PriorityQueue;

public class S2야근지수 {
	public static void main(String[] args) {
		int[] works = {2, 1, 2};
		long answer = 0;
		int n = 1;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : works) {
			pq.add(i);
		}

		while (n-- > 0) {
			int num = pq.poll();
			num = num >= 1 ? num - 1 : 0;
			pq.add(num);
		}

		// for (int i = 0; i < n; i++) {
		// 	if(pq.isEmpty())break;
		// 	int tmp = pq.poll();
		// 	pq.add(tmp - 1);
		// }

		for (int i : pq) {
			answer += Math.pow(i, 2);
		}
	}
}
