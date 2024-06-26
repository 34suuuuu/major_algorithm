package A5dp;

public class D1DpBasic {
	public static void main(String[] args) {
	// 	1,4,5 숫자를 조합하여 13을 만들 수 있는 조합 중 가장 짧은 조합의 길이
	//	주어진 수들이 배수관계에 있지 않기 떄문에 greedy가 아닌 dp
	// 	dfs, bfs 는 너무 오래걸릴것같다..

	// 	12, 9,8 중에 가장 작은 조합을 가진 조합의 개수에 +1
	// 	Min(f(n-1), f(n-2)...) + 1
		int target = 13;

		int[] numbers = {1, 4, 5};
		int[] dp = new int[target + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		dp[4] = 1;
		dp[5] = 1;

		for (int i = 6; i <= target; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < numbers.length; j++) {
				min = Math.min(min, dp[i - numbers[j]]);
			}
			dp[i] = min + 1;
		}

		System.out.println(dp[target]);
	}
}
