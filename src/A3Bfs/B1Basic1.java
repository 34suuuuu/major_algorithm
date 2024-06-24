package A3Bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1Basic1 {
	static List<List<Integer>> adjList;
	static boolean[] visited;

	public static void main(String[] args) {
		adjList = new ArrayList<>();
		visited = new boolean[5];
		int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
		for (int i = 0; i <= 4; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int[] a : arr) {
			adjList.get(a[0]).add(a[1]);
			// 앙향뱡일 경우
			// adjList.get(a[0]).add(a[1]);
		}
		bfs(0);
	}

	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			System.out.print(cur+ " ");
			for (int target : adjList.get(cur)) {
				// target을 queue에 add하기 전에 true로 셋팅
				if (!visited[target]) {
					visited[target] = true;
					queue.add(target);
				}
			}
		}
	}
}
