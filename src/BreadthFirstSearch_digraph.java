import java.util.*;

class Graph{
	private int v;
	private LinkedList<Integer> adj[];
	
	Graph(int V){
		v = V;
		adj = new LinkedList[V];
		for(int i=0; i<v; i++){
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void BFS(int root){
		Boolean visited[] = new Boolean[v];
		for(int i =0; i<v; i++){
			visited[i] = false;
		}
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[root] = true;
		queue.add(root);
		
		while(queue.size() != 0){
			root = queue.poll();
			System.out.print(root + " ");
			
			Iterator<Integer> i = adj[root].listIterator();
			
			while(i.hasNext()){
				int n = i.next();
				//System.out.print(visited[n]);
				if(visited[n] == false){
					queue.add(n);
					visited[n] = true;
				}
			}
		}
	}
}

public class BreadthFirstSearch_digraph {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
	}

}
