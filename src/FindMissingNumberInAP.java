import java.util.*;
//import java.lang.*;
//import java.io.*;

class FindMissingNumberInAP {
    
    static int find_diff(int A[], int N) {
        int d = A[1] - A[0];
        int temp;
        if(N==2){
            return (A[1]-A[0])/2;
        }
        
        for(int i=2; i<N; i++) {
            temp = A[i] - A[i-1];
            /*if(d==temp){
                break;
            }*/
            d = Math.min(temp,d);
        }
        return d;
    }
    
    static int find_missing(int A[], int N, int d) {
        int temp = 0;
        for(int i=0; i<N; i++) {
            temp = A[0] + (i * d);
            if(temp != A[i]){
                break;
            }
        }
        return temp;
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		       int N = sc.nextInt();
		       int A[] = new int[N];
		       for(int j =0; j<N; j++) {
		           A[j] = sc.nextInt();
		       }
		       int d = find_diff(A, N);
		       //System.out.println(d);
		       System.out.println(find_missing(A, N, d));
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}