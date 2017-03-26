//import java.lang.*;
//import java.io.*;
import java.util.Scanner;

class ReverseStringSpCharPosSame {
    
    static void reversestring(char A[], int N){
        char temp[] =new char[N];
        for(int i=0; i<N; i++){
            if((A[i]<'a' || A[i]>'z') && (A[i]<'A' || A[i]>'Z')){
                temp[i] = A[i];
            }
        }
        
        int j = N-1;
        for(int i=0;i<N;i++){
            if((A[i]>='a' && A[i]<='z') || (A[i]>='A' && A[i]<='Z')){
                if(temp[j] == '\0'){
                    temp[j] = A[i];
                }
                else{
                    i--;
                }
                j--;
            }
        }
        for(int i=0;i<N;i++){
        	System.out.print(temp[i]);
        }
        System.out.println();
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        String S = sc.next();
		        char A[] =S.toCharArray();
		        reversestring(A, A.length);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}