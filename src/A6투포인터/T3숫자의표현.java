package A6투포인터;

public class T3숫자의표현 {
	public static void main(String[] args) {
		int n = 15;

		int answer = 0;
		int start = 1;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
			while (sum > n) {
				sum -= start;
				start++;
			}
			if (sum == n) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
