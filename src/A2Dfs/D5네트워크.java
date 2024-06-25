package A2Dfs;

import java.util.LinkedList;
import java.util.Queue;

public class D5네트워크 {
	static int cnt = 0;
	static boolean[] visited;
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 0}};
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				bfs(i, computers);
				cnt++;
			}
		}

		bfs(0, computers);
		System.out.println(cnt);
	}

	static void bfs(int start, int[][] computers) {
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		visited[start] =true;

		while (!que.isEmpty()) {
			int cur = que.poll();
			visited[cur] =true;

			for (int i = 0; i < computers.length; i++) {
				if (!visited[i] && computers[cur][i] == 1 && i != cur) {
					que.add(i);
				}
			}
		}
	}
}
