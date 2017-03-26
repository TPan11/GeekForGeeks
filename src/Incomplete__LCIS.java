import java.util.*;
//import java.lang.*;
//import java.io.*;

public class Incomplete__LCIS {
	
	static int LCIS(int A[], int B[], int a, int b) {
		int C[][] = new int[a+1][b+1];
		for(int i=0;i<a+1;i++) {
			C[i][0] = 0;
		}
		for(int i=0;i<b+1;i++) {
			C[0][i] = 0;
		}
		
		for(int i=1; i<a+1; i++) {
			for(int j=1; j<b+1; j++) {
				if(A[i-1] == B[j-1]) {
					C[i][j] = C[i-1][j-1] + 1;
				}
				else
					C[i][j] = Math.max(C[i-1][j], C[i][j-1]);
			}
		}
		
		
		for(int i = 0; i<b+2; i++){
			if(i>1)
				System.out.print(B[i-2] + "\t");
			else
				System.out.print("0\t");
		}
		System.out.println();
			
		
		for(int i=0;i<C.length;i++){
			if(i>0)
				System.out.print(A[i-1] + "\t");
			else
				System.out.print("0\t");
			for(int j=0; j<C[0].length;j++) {
				/*if(j>0)
					System.out.print(B[j-1] + " ");*/
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int result[] = new int[C[a][b]];
		
		for(int i=a, j=b, k= result.length-1; i>0 && j>0 ;) {
			if(C[i][j] == C[i][j-1]) {
				j--;
			}
			else if(C[i][j] == C[i-1][j]) {
				i--;
			}
			else {
				result[k--] = A[i-1];
				i--;
				j--;
			}
		}
		
		//result = reverse(result);
		
		/*for(int i=1; i<result.length; i++) {
			System.out.print(result[i] +" ");
		}
		System.out.println();*/
		
		
		
		int finalresult =0;
		if(result.length == 0)
			return 0;
		else if(result.length == 1)
			return 1;
		else {
			for(int i=0; i<result.length-1; i++) {
				int size = 1;
				int pointer = result[i];
				for(int j=i+1; j<result.length; j++) {
					if(pointer<result[j]) {
						pointer = result[j];
						size++;
					}
					/*else {
						break;
					}*/
				}
				if(finalresult < size)
					finalresult = size;
			}
		}
		return finalresult;
		
	}
	
	public static void main(String args[]) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		    	int a,b;
		    	a = sc.nextInt(); 
		    	int A[] = new int[a];
		    	for(int j=0 ; j < a ; j++) {
		    		A[j] = sc.nextInt();
		    	}
		    	b = sc.nextInt(); 
		    	int B[] = new int[b];
		    	for(int j=0 ; j < b ; j++) {
		    		B[j] = sc.nextInt();
		    	}
		    	int result = LCIS(A,B,a,b);
		    	System.out.println(result);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}
/*7
74 63 71 97 82 6 26  
35 
28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89 85 4 52 55 100 33 61 77 69 40 13 27 87 */


/*39 
70 18 18 97 25 44 71 84 91 100 73 26 45 91 6 40 55 87 70 83 43 65 98 8 56 5 49 12 23 29 100 44 47 69 41 23 12 11 6  
2 
62 31 */


/*36 
30 44 36 78 1 39 72 50 90 68 89 93 96 44 45 30 91 83 41 42 70 27 33 62 43 61 18 24 62 82 10 91 26 97 68 78  
35 
91 27 25 58 15 69 6 59 13 87 1 47 27 95 17 53 79 30 47 91 48 71 52 81 32 94 58 28 13 87 15 56 13 91 13*/

/*50 
35 20 16 36 88 54 70 51 88 3 38 63 90 11 6 61 5 12 58 30 4 17 93 22 23 6 44 80 62 29 79 48 1 46 83 88 100 52 90 87 54 27 49 95 37 7 8 93 18 65  
22 
21 81 67 95 55 24 38 34 85 18 13 32 18 10 66 57 9 70 46 96 23 72*/