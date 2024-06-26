package A4greedy;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class G2체육복 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 5;          // 학생 수
		int[] lost = {2, 4};     // 체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {1, 3, 5};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		// int[] reserve = {3};   //여벌의 체육복을 가져온 학생들의 번호가 담긴 배열

		Set<Integer> lostSet = new HashSet<>();
		Arrays.sort(reserve);

		for (int l : lost) {
			lostSet.add(l);
		}

		for (int i = 0; i < reserve.length; i++) {
			if(lostSet.contains(reserve[i])){
				lostSet.remove(reserve[i]);
				reserve[i] = -1;
			}
		}

		for (int i = 0; i < reserve.length; i++) {
			if (reserve[i] == -1) continue;
			if (lostSet.contains(reserve[i] - 1)) {
				lostSet.remove(reserve[i] - 1);
			}else if (lostSet.contains(reserve[i] + 1)) {
				lostSet.remove(reserve[i] + 1);
			}
		}
		System.out.println(lostSet.size());
	}
}