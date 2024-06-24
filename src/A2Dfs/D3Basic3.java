package A2Dfs;

import java.util.ArrayList;
import java.util.List;

public class D3Basic3 {
	static List<List<Integer>> adjList;

	public static void main(String[] args) {
		// D2와 다른 점 ) 0부터 시작하지 않음 !
		// list, 배열 1개 넉넉하게 잡으면 됨
		// 출력 예시) [[1,2,4,8], [1,2,4,9], [1,2,5,10], [1,3,6], [1,3,7]];
		// 전체 리스트(이중 리스트), 부분 리스트(단일 리스트) 필요
		int[][] arr = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {4, 9}, {5, 10}};

		adjList = new ArrayList<>();

		for (int i=0; i<11; i++){
			adjList.add(new ArrayList<>());
		}
		for (int[] a : arr){
			adjList.get(a[0]).add(a[1]);
		}
		List<List<Integer>> answer = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		temp.add(1);
		dfs(answer, temp, 1);
		System.out.println(answer);
	}

	static void dfs(List<List<Integer>> answer, List<Integer> temp, int start){
		if(adjList.get(start).isEmpty()){
			answer.add(new ArrayList<>(temp));
			return;
		}
		for(int target : adjList.get(start)){
			temp.add(target);
			dfs(answer, temp, target);
			temp.remove(temp.size()-1);     // 백트래킹
		}
	}
}