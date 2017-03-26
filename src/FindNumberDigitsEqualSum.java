import java.util.*;
//import java.lang.*;
//import java.io.*;

class FindNumberDigitsEqualSum {
    
    static void find_number(int N, int S) {
        String str = new String();
        while(N>0) {
            if(S==0){
                str= str + "0";//System.out.print(0);
            }
            else if(S>9){
            	str= str + "9";//System.out.print(9);
                S=S-9;
            }
            else{
            	str= str + S;//System.out.print(S);
                S=0;
            }
            N--;
        }
        if(S>0)
            System.out.print(-1);
        else
            System.out.print(str);
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        int S = sc.nextInt();
		        if(S>0)
		            find_number(N,S);
		        else
		            System.out.print(-1);
		        System.out.println();
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}