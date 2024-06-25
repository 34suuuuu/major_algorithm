package A2Dfs;

public class D6타켓넘버 {
	// static int[] numbers = {1, 1, 1, 1, 1};
	// static int target = 3;
	static int answer = 0;

	static int[] numbers = {4,1,2,1};
	static int target = 4;

	public static void main(String[] args) {
		answer = 0;
		int idx = 0;

		dfs(0, idx, numbers, target);
		System.out.println(answer);
	}

	static void dfs(int num, int idx, int[] numbers, int target) {
		if (idx == numbers.length) {
			if(num == target){
				answer++;
				return;
			}
		} else {
			dfs(num - numbers[idx], idx + 1, numbers, target);
			dfs(num + numbers[idx], idx + 1, numbers, target);
		}
	}
}
