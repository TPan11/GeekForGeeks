import java.util.*;
//import java.lang.*;
//import java.io.*;

class DivideInto3Parts{
    
    static void dividenumber(int N){
        int count=0;
        int k =0;
        for(int i =0 ; i<=N; i++){
            for(int j=0; j<=N; j++){
                k = N-(i+j);
                if(k<0){
                    break;
                }
                count++;
            }
        }
        System.out.println(count);
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        dividenumber(N);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}