package A4greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class G3구명보트 {
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};    // 50,50,70,80
		int limit = 100;
		int answer = 0;

		Deque<Integer> deque = new ArrayDeque<>();
		Arrays.sort(people);

		for (int i : people) {
			deque.add(i);
		}

		int total = 0;
		while(!deque.isEmpty()) {
			int last = deque.pollLast();
			answer++;

			if (!deque.isEmpty() && last + deque.peekFirst() <= limit) {
				deque.pollFirst();
			}
		}
		System.out.println(answer);
	}
}
