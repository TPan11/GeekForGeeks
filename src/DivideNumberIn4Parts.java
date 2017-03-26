import java.util.*;
//import java.lang.*;
//import java.io.*;

class DivideNumberIn4Parts {
    
    static void dividenumber(int N){
        int count=0;
        int i=1,j=1,k=1,l=N-3;
        for(i=1;i<=j;i++){
            for(j=i;j<=k;j++){
                for(k=j;;k++){
                	l=N-(i+j+k);
                	if(k<=l)
                		count++;
                	else
                		break;
                }
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