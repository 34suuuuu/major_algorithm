package A5dp;

import java.util.Arrays;

public class D3정수삼각형 {
	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int answer = 0;

		int[][] dp = new int[triangle.length][];
		dp[0] = Arrays.copyOf(triangle[0], triangle[0].length);

		answer = Integer.MIN_VALUE;
		for (int i = 1; i < triangle.length; i++) {
			dp[i] = new int[triangle[i].length];
			for (int j = 0; j < triangle[i].length - 1; j++) {
				// if (dp[i][j] + triangle[i + 1][j] > dp[i + 1][j]) {
				// 	dp[i + 1][j] = dp[i][j] + triangle[i + 1][j];
				// }
				// if (dp[i][j] + triangle[i + 1][j + 1] > dp[i + 1][j + 1]) {
				// 	dp[i + 1][j + 1] = dp[i][j] + triangle[i + 1][j + 1];
				// }

				// 내 코드
				if (j == 0) {
					dp[i][j] = dp[i - 1][j] + triangle[i][j];
				}  else if (j == triangle[i].length - 1) {
					dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
				}
			}
		}
		answer = Arrays.stream(dp[triangle.length - 1]).max().getAsInt();
		System.out.println(answer);
	}
}
