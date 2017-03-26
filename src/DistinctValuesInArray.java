import java.util.*;
//import java.lang.*;
//import java.io.*;

class DistinctValuesInArray {
    static int absolute(int n) {
        if(n < 0)
            return (-1*n);
        else
            return n;
    }
    
    static int distict_vals(int A[], int N) {
        int result = 0;
        for(int i=0; i<N; i++) {
            int pointer = absolute(A[i]);
            result++;
            for(int j=0; j<i; j++) {
                if(pointer == absolute(A[j])){
                     result--;
                     break;
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
		    for(int i =0; i<T; i++) {
		        int N = sc.nextInt();
		        int A[] = new int[N];
		        for(int j =0;j<N;j++) {
		            A[j] = sc.nextInt();
		        }
		        System.out.println(distict_vals(A, N));
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}