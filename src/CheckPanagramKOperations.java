//import java.lang.*;
//import java.io.*;
import java.util.*;

class CheckPanagramKOperations {
    
    static void checkpanagram(String str, long K) {
		str = str.toLowerCase();
		long count = 0;
		for(char alphabet='a'; alphabet<='z'; alphabet++) {
			if(str.indexOf(alphabet) == -1){
				count++;
				if(count > K){
					System.out.println(0);
					return;
				}
			}
		}
		System.out.println(1);
	}
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    long K;
		    String str = new String();
		    for(int i=0; i<T; i++){
		    	str = sc.next();
		    	K = sc.nextInt();
		    	if(str.length()<=26){
		    		System.out.println(0);
		    	}
		    	else if(K>=26){
		    		System.out.println(1);
		    	}
		    	else{
		    		checkpanagram(str, K);
		    	}
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}