package A6투포인터;

public class T4슬라이딩윈도우 {
	public static void main(String[] args) {
		int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		int maxValue = Integer.MIN_VALUE;
		for (int i = k; i < nums.length; i++) {
			sum += (nums[i] - nums[i - k]);
			maxValue = Math.max(maxValue, sum);
		}
		System.out.println(maxValue);
	}
}
