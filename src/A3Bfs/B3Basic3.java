package A3Bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B3Basic3 {
	static List<List<Integer>> adjList;
	static boolean[] visited;
	static int[] dist;

	public static void main(String[] args) {
		adjList = new ArrayList<>();
		visited = new boolean[5];
		dist = new int[5];

		int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
		for (int i = 0; i <= 4; i++) {
			adjList.add(new ArrayList<>());
		}
		for (int[] a : arr) {
			adjList.get(a[0]).add(a[1]);
		}

		int start = 0;
		int end = 3;
		int minDistance = bfs(start, end);
		System.out.println(minDistance);
		System.out.println(Arrays.toString(dist));	// end까지만 진행하고 이 후에는 진행하지 않기 때문에 배열의 뒷 값은 모두 0
	}

	static int bfs(int start, int end) {
		Queue<Integer> queue = new LinkedList<>();
		int cnt = 0;
		queue.add(start);

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int target : adjList.get(cur)) {
				// target을 queue에 add하기 전에 true로 셋팅
				if (!visited[target]) {
					visited[target] = true;
					dist[target] = dist[cur] + 1;
					queue.add(target);

					if (target == end) {
						return dist[target];
					}
				}
			}
		}
		return -1;
	}
}
