import java.util.*;
//import java.lang.*;
//import java.io.*;

class PairsDivisibleByThree {
    
    static int twopair(int A[], int N) {
        int result = 0;
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if((A[i]+A[j])%3 == 0)
                    result++;
            }
        }
        return result;
    }
    
    static int threepair(int A[], int N) {
        int result = 0;
        for(int i=0; i<N-2; i++) {
            for(int j=i+1; j<N-1; j++) {
                for(int k=j+1; k<N; k++) {
                    if((A[i]+A[j]+A[k])%3 == 0)
                        result++;
                }
            }
        }
        return result;
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        int A[] = new int[N];
		        for(int j=0; j<N; j++) {
		            A[j] = sc.nextInt();
		        }
		        System.out.println(twopair(A, N) + threepair(A,N));
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}