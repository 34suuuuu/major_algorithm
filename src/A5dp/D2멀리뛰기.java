package A5dp;

public class D2멀리뛰기 {
	public static void main(String[] args) {
		int n = 3;
		long answer = 0;

		long[] dp = new long[10000];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
		}

		System.out.println(dp[n]);
	}
}
