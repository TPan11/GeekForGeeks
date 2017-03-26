import java.util.*;
//import java.lang.*;
//import java.io.*;

class Optimize__MaxOnesAfterToggle {
    
    static int countones(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1')
                count++;
        }
        return count;
    }
    
    static int toggle(String S, int i, int j){
        int count = countones(S.substring(0,i) + S.substring(j+1));
        for(int k =i; k<=j; k++){
            if(S.charAt(k) == '0'){
                count++;
            }
        }
        return count;
    }
    
    static int Max(int a, int b){
    	if(a>b)
    		return a;
    	return b;
    }
    
    static void printmaxones(String S){
        int maxcount = 0;
        for(int i =0; i<S.length(); i++){
            for(int j=i; j<S.length(); j++){
                int count = toggle(S, i, j);
                maxcount = Max(maxcount, count);
            }
        }
        System.out.println(maxcount);
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        String S = sc.next();
		        printmaxones(S);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}