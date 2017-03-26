import java.io.*;
import java.util.*;

class ShortestPath{
	private int v;
	private int distance[];
	private boolean flags[]; 
	
	int min_index(int distance[], boolean flags[]){
		int index = -1, min = Integer.MAX_VALUE;
		for(int i=0; i<v; i++){
			if(flags[i] == false && distance[i] <= min){
				index = i;
				min = distance[i];
			}
		}
		return index;
	}
	
	void calculate(int graph[][], int src){
		v = graph.length;
		
		distance = new int[v];
		flags = new boolean[v];
		
		for(int i=0; i<v; i++){
			distance[i] = Integer.MAX_VALUE;
			flags[i] = false;
		}
		
		distance[src] = 0;
		
		for(int i=0; i<v; i++){
			int x = min_index(distance, flags);

			flags[x] = true;
			
			for(int y=0; y<v; y++){
				if(flags[y]==false && distance[y]>distance[x]+graph[x][y] && graph[x][y]!=0 && distance[x] != Integer.MAX_VALUE){
					distance[y] = distance[x]+graph[x][y];
				}
			}
		}
		
		for(int i=0; i<v; i++){
			System.out.println(i + "\t\t" + distance[i]);
		}
	}
}


public class Djikstras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 0, 10, 0, 2, 0, 0},
            {0, 0, 0, 14, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
           
        ShortestPath t = new ShortestPath();
        t.calculate(graph, 1);
	}

}
