import java.util.*;
//import java.lang.*;
//import java.io.*;

class GoodnumAndNotContainingDigit {
    
    static int adddigit(int num) {
        int sum = 0;
        while(num>0) {
            sum = sum + (num%10);
            num = num / 10;
        }
        return sum;
    }
    
    static boolean containsdigit(int num, int d) {
        while(num>0){
            if(num%10 == d){
                return true;
            }
            num = num /10;
        }
        return false;
    }
    
    static boolean isgoodnum(int num){
        double divnum =0, modnum=0;
        double len = Integer.toString(num).length() - 1;
        double temp = num;
        while(len>0) {
            divnum = temp / Math.pow(10.0,len);
            modnum = temp % Math.pow(10.0,len);
            if((int)divnum>adddigit((int)modnum)){
                temp = modnum;
            }
            else{
                return false;
            }
            len--;
        }
        return true;
    }
    
    static void print_numbers(int L, int R, int D) {
        int count = 0;
        for(int i = L; i<=R; i++){
            if(!containsdigit(i,D) && isgoodnum(i)){
                count++;
                System.out.print(i + " ");
            }
        }
        if(count == 0)
            System.out.print(-1 + " ");
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int D = sc.nextInt();
		        int L = sc.nextInt();
		        int R = sc.nextInt();
		        print_numbers(L, R, D);
		        System.out.println();
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}