package A3Bfs;

import java.util.*;

public class B4가장먼노드 {
	public static void main(String[] args) {
		int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		int n = 6;
		int answer = 0;

		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			adjList.add(new ArrayList<>());
		}
		boolean[] visited = new boolean[n + 1];
		int[] dist = new int[n + 1];
		for (int[] i : edge) {
			adjList.get(i[0]).add(i[1]);
			adjList.get(i[1]).add(i[0]);
		}


		int maxDist = Integer.MIN_VALUE;
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		while (!que.isEmpty()) {
			int cur = que.poll();

			for(int target : adjList.get(cur)) {
				if (!visited[target]) {
					visited[target] = true;
					dist[target] = dist[cur] + 1;
					que.add(target);
				}
				maxDist = Math.max(maxDist, dist[target]);
			}
		}
		for (int i = 0; i <= n; i++) {
			if (i != 1 && maxDist == dist[i]) {
				answer++;
			}
		}
	}
}
