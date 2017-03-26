import java.util.*;
//import java.lang.*;
//import java.io.*;

class SumOfBitAddition {
    
    static void bitadd(int A[], int N){
        int result = 0;
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N;j++){
                result += (A[i]&A[j]);
            }
        }
        System.out.println(result);
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        int A[] = new int[N];
		        for(int j=0;j<N;j++){
		            A[j] = sc.nextInt();
		        }
		        bitadd(A, N);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}