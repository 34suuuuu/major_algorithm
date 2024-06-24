package A2Dfs;

import java.util.ArrayList;
import java.util.List;

public class D1Basic {
	static List<List<Integer>> adjList;
	static boolean[] visited;

	public static void main(String[] args) {
	// 	방문할 수 있는 정점이 여러개인 경우 정점번호가 작은것을 먼저 방문하는
	// 	dfs알고리즘 형식의 방문 순서를 출력하라
	// 	0,1,3,2,4

		int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
		adjList = new ArrayList<>();
		visited = new boolean[5];
		for (int i = 0; i <= 4; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int[] a : arr) {
			adjList.get(a[0]).add(a[1]);
		// 앙향뱡일 경우
			// adjList.get(a[0]).add(a[1]);
		}
		dfs(0);
	}

	static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");

		for (int target : adjList.get(start)) {
			// 방문하지 않았다면 방문
			if (!visited[target]) {
				dfs(target);
			}
		}
	}
}
