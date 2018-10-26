package week5_DFS_BFS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Graph {

	public int nmbrOfNodes;
	private List<Integer>[] adjList; // Array of Lists!
	private boolean isDirected;

	public List<Integer>[] getAdjList() {
		return adjList;
	}

	public Graph(String file_name, boolean directed) {
		isDirected= directed;
		try {
			fill_Adj_List(file_name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private void fill_Adj_List(String file_name) throws IOException {
		File f= new File(file_name);
		
		String sCurrentLine;
		BufferedReader br= new BufferedReader(new FileReader(f));
		String[] temp;
		sCurrentLine= br.readLine();
		temp= sCurrentLine.split("\\s+"); // first line; number of nodes
		nmbrOfNodes= Integer.parseInt(temp[0]);

		adjList = new List[nmbrOfNodes];
		for (int i = 0; i < nmbrOfNodes; i++)
			adjList[i] = new ArrayList<>();

		while ((sCurrentLine = br.readLine()) != null) {
			temp= sCurrentLine.split("\\s+");
			if (temp.length<= 1) continue;
			adjList[Integer.parseInt(temp[0])].add(Integer.parseInt(temp[1]));
			if (!this.isDirected)
				adjList[Integer.parseInt(temp[1])].add(Integer.parseInt(temp[0]));
		} // end while
		br.close();	
	}
	
	@Override
	public String toString() {
		// returns a String representation of its adjacency list
		StringBuilder output=new StringBuilder();
		output.append("number of nodes: "+ nmbrOfNodes+"\n");
		
		List<Integer> row;
		for (int node=0; node< adjList.length; node++){
			output.append(node+": ");
			row= adjList[node];
			for (int s: row){
				output.append(s+"  ");
			}
			output.append("\n");
		}	
		return output.toString();
	}
	
	
	
}
