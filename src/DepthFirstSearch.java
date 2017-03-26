import java.util.*;
class Graph3{
	private int v;
	private LinkedList<Integer> adj[];
	
	Graph3(int V){
		v = V;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int x, int y){
		adj[x].add(y);
	}
	
	void DFS(int root){
		boolean visited[] = new boolean[v];
		for(int i=0; i<v; i++){
			visited[i] = false;
		}
		DFS_recur(root, visited);
	}
	
	void DFS_recur(int root, boolean visited[]){
		visited[root] = true;
		System.out.print(root + "  ");
		
		Iterator<Integer> i = adj[root].listIterator();
		
		while(i.hasNext()){
			int n = i.next();
			
			if(visited[n] == false){
				DFS_recur(n, visited);
			}
		}
	}
}

public class DepthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph3 g = new Graph3(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS(2);
	}

}
