import java.util.*;
//import java.lang.*;
//import java.io.*;

class CountZeros {
    
    static void countzeros(int A[], int N) {
        while(N>0) {
            if(A[N] == 1)
                break;
            N--;
        }
        System.out.println(A.length - N - 1);
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
		        if(A[0] == 0) {
		            System.out.println(N);
		        }
		        else if(A[N-1] == 1) {
		            System.out.println(0);
		        }
		        else {
		            countzeros(A, N-2);
		        }
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}