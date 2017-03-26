import java.util.*;
//import java.lang.*;
//import java.io.*;

class FactorialPairs {
    static long factorial(long num) {
        long result = 1L;
        while(num>1) {
            result *= num;
            num--;
        }
        return result;
    }
    
    static boolean is_square(long num) {
        double num_squared = Math.sqrt(num);
        long i = (long)num_squared;
        if (i != num_squared)
            return false;
        else
            return true;
    }
    
    /*static long calculate(long a, long b) {
        int result = 1;
        while(b>a) {
            result *= b;
            b--;
        }
        return result;
    }*/
    
    static boolean calculate(long a, long b) {
        long result = 1L;
        while(b>a){
            if(is_prime(b)){
                return false;
            }
            result *= b;
            b--;
        }
        if(is_square(result))
            return true;
        return false;
    }
    
    static boolean is_prime(long b) {
        if(b<=1)
            return false;
        else if(b<=3)
            return true;
        else if(b%2 ==0 || b%3 == 0)
            return false;
        int i =5;
        while(i*i<=b) {
            if(b%i == 0 || b%(i+2) == 0)
                return false;
            i = i+ 6;
        }
        return true;
    }
    
    static long factpair(long L, long R) {
        long count = 0;
        for(long i=L;i<=R;i++){
            for(long j=i+1;j<=R;j++){
                //num = calculate(i,j);
                //num = factorial(i) * factorial(j);
                if(calculate(i,j)) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        return count;
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        long L = sc.nextLong();
		        long R = sc.nextLong();
		        System.out.println(factpair(L,R));
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}