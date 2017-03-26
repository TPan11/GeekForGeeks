import java.util.*;
//import java.lang.*;
//import java.io.*;

class CheckProduct {
    
    static String checkproduct(int A[], int N, int p){
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(A[i]*A[j] == p){
                    return "Yes";
                }
            }
        }
        return "No";
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        int p = sc.nextInt();
		        int A[] = new int[N];
		        for(int j=0; j<N; j++){
		            A[j] = sc.nextInt();
		            
		        }
		        System.out.println(checkproduct(A,N,p));
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}