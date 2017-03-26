
public class FloydWarshall {
	
	final static int INF = 9999;
	
	static void calculate(int graph[][]){
		int v = graph.length;
		int dist[][] = new int[v][v];
		
		for(int i=0; i<v; i++){
			for(int j=0; j<v; j++){
				dist[i][j] = graph[i][j];
			}
		}
		
		for(int k=0; k<v; k++){
			for(int i=0; i<v; i++){
				for(int j=0; j<v; j++){
					if(dist[i][k]+dist[k][j] < dist[i][j]){
						dist[i][j] = dist[i][k]+dist[k][j];
					}
				}
			}
		}
		
		for(int i=0; i<v; i++){
			for(int j=0; j<v; j++){
				if(dist[i][j] == INF)
					System.out.print("INF\t");
				else
					System.out.print(dist[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int graph[][] = { {0,   5,  INF, 10},
                 {INF, 0,   3, INF},
                 {INF, INF, 0,   1},
                 {INF, INF, INF, 0}
               };
		 calculate(graph);
	}

}
