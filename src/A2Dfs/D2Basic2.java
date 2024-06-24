package A2Dfs;

import java.util.*;

public class D2Basic2 {
	static List<List<Integer>> adjList;
	static boolean[] visited;

	public static void main(String[] args) {
		int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {3,5},{2, 4}};
		adjList = new ArrayList<>();
		visited = new boolean[6];

		for (int i = 0; i < 6; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int[] a : arr) {
			adjList.get(a[0]).add(a[1]);
			adjList.get(a[1]).add(a[0]);
		}
		dfs(0);
	}

	static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		for (int i : adjList.get(start)) {
			if(!visited[i]) {dfs(i);}
		}
	}
}
