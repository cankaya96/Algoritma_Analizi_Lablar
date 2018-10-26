package week5_DFS_BFS;

import Lab5_Hazırlık.DepthFirstSearchExampleNeighbourList;
import java.util.List;
import java.util.Stack;

public class DFS {

	private List<Integer>[] adjList;
	boolean[] visited;

	public DFS(List<Integer>[] aList) {
		adjList= aList;
		visited= new boolean[adjList.length];
		for (boolean b: visited)
			b= false;
	}


	public void dfs(int a) {
    // implement this
        visited[a]=true;
        System.out.print(a + "-");
        int neighbor;
        int current_node=a;
        
            for (boolean b: visited) {
                neighbor = getUnvisitedNeighbor(current_node);
                if(neighbor!=-1)
                    dfs(neighbor);
            }

	}
	int sayac=0;
	public boolean isConnected(){
    // implement this
            int a=12;
            
            visited[a]=true;
            sayac++;
        int neighbor;
        int current_node=a;
        
            for (boolean b: visited) {
                neighbor = getUnvisitedNeighbor(current_node);
                if(neighbor!=-1)
                    dfs(neighbor);
            }
                if(adjList.length==sayac){
                return true;
                }

		else
                    return false;
	}

	public void dfs_no_recursion(int root) {
		// We can avoid using recursion by pushing active nodes onto a stack
		Stack<Integer> s = new Stack<Integer>();
		s.push(root);
		int current_node;

		visited[root] = true;
		System.out.print(root + " ");

		int neighbor;
		while (!s.isEmpty()) {
			current_node = s.peek();
			neighbor = getUnvisitedNeighbor(current_node);
			if (neighbor != -1) { // root has a neighbor
				visited[neighbor] = true;
				System.out.print(neighbor + " ");
				s.push(neighbor);
			} else
				s.pop();
		} // end while

	}

	private int getUnvisitedNeighbor(int root) {
		for (int neighbor : adjList[root]) {
			if (!visited[neighbor]) {
				return neighbor;
			} // end if
		} // end for each
		return -1; // no unvisited neighbor has been found
	}

	public void clearVisited() {
		for (int i = 0; i < visited.length; i++)
			visited[i] = false;
	}

}
