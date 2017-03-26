import java.util.*;
//import java.lang.*;
//import java.io.*;

class TilesFibonacci {
    
    static long fibonacci(int N) {
        long result = 0;
        long a=0;
        long b=1;
        while(N>0) {
            result = b + a;
            a = b;
            b = result;
            N--;
            System.out.println(result);
        }
        return result;
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        System.out.println(fibonacci(sc.nextInt()));
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}