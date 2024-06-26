package A3Bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B6게임맵 {
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static boolean[][] visited;
	static int n, m;

	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		n = maps.length;
		m = maps[0].length;

		visited = new boolean[n][m];
		System.out.println(bfs(maps));
	}

	static int bfs(int[][] maps) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0, 0, 1});
		visited[0][0] = true;

		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int curX = cur[0];
			int curY = cur[1];
			int move = cur[2];
			visited[curX][curY] = true;

			if (curX == n - 1 && curY == m - 1) {
				// 종료 조건
				return move;
			}

			for (int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];

				if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;	// 이동 지점이 maps안에 있는지 확인

				if (!visited[nx][ny] && maps[nx][ny] == 1) {// 방문하지않았고, 벽이 아니라면 방문
					visited[nx][ny] = true;
					que.add(new int[] {nx, ny, move + 1});
				}
			}
		}
		return -1;
	}
}
