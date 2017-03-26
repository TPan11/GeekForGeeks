import java.util.*;
//import java.lang.*;
//import java.io.*;

class ProductOfPrime {
    
	static boolean is_prime(long number) {
        for(long i = 2; i<=Math.sqrt(number); i++) {
            if(number%i == 0)
                return false;
        }
        return true;
    }
	
	static boolean is_prime2(long n) {
		if(n<=1)
			return false;
		else if(n<=3)
			return true;
		else if(n%2==0 || n%3 == 0)
			return false;
		long i =5;
		while(i*i<=n) {
			if(n%i ==0 || n%(i+2)==0)
				return false;
			i = i+6;
		}
		return true;
	}
    		
    static long productofprime(long lower, long higher) {
        long result = 1;
        long modulo = (long)Math.pow(10, 9) +7;
        for(long i = lower; i <= higher; i++) {
            if(is_prime(i)){
                result *= i;
                result = result%modulo;
            }
        }
        return result;
    }
    
	public static void main (String[] args) {
		//code
		try{
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i =0 ; i< T;i++) {
		        long lower = sc.nextLong();
		        long higher = sc.nextLong();
		        System.out.println(productofprime(lower, higher));
		    }
		    sc.close();
	    }
	    catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}