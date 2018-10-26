package week5_DFS_BFS;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Graph G= new Graph("C:/Users/M. Furkan Çankaya/Documents/M_FURKAN_CANKAYA/Algoritma_Analizi_Lablar/Algoritma_Analizi/src/week5_DFS_BFS/edges2.txt", false); // directed: false
		System.out.println(G); // Adjacency matrix will be printed out. 
		
		int start;
		int end;
		System.out.print("Enter start node: ");
		Scanner scanner = new Scanner(System.in);
		start = scanner.nextInt();
		
		System.out.println("Graph Traversal with DFS using recursion");
		DFS dfSearcher= new DFS(G.getAdjList()); // Creates a new DFS object
		dfSearcher.dfs(start);
		
		System.out.println();
		System.out.println("Graph connected: "+ dfSearcher.isConnected());

		

		
//		dfSearcher.clearVisited();
//		System.out.println();

//		System.out.println("Now, without recursion, using stack");
//		dfSearcher.dfs_no_recursion(start);
//		dfSearcher.clearVisited();
//		System.out.println();
	}

	
	

	
	
	
	

}
