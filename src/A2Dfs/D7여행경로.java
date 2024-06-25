package A2Dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D7여행경로 {
	static boolean[] visited;
	static ArrayList<String> resultList;

	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
		String[] answer;

		visited = new boolean[tickets.length];
		int idx = 0;
		resultList = new ArrayList<>();
		//
		// Arrays.sort(tickets, new Comparator<String[]>() {
		// 	@Override
		// 	public int compare(String[] o1, String[] o2) {
		// 		return o1[1].compareTo(o2[1]);
		// 	}
		// });

		dfs(tickets,"ICN", "ICN ", idx);
		Collections.sort(resultList);
		answer = resultList.get(0).split(" ");

		System.out.println(Arrays.toString(answer));
	}

	static void dfs(String[][] tickets, String start, String result, int idx) {
		if (idx == tickets.length) {
			resultList.add(result);
			return;
		}
		for (int i = 0; i < tickets.length; i++) {
			if (start.equals(tickets[i][0]) && !visited[i])  {
				visited[i] = true;
				// result += (tickets[i][1] + " ");
				dfs(tickets, tickets[i][1], result + tickets[i][1] + " ", idx + 1);
				// result = result.substring(0, result.length() - 4);
				visited[i] = false;
			}
		}
	}
}
