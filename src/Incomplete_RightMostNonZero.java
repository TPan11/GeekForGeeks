import java.util.*;
//import java.lang.*;
//import java.io.*;

class Incomplete_RightMostNonZero {
    
    static int[] findlastdigit(long A[], int N){
        int numbercount[] = {0,0,0,0,0,0,0,0,0};
        for(int i=0; i<N; i++){
        	int tempnum = (int)A[i]%10;
        	if(tempnum == 0){
        		continue;
        	}
        	else if(tempnum == 4){
        		numbercount[2]+=2;
        	}
        	else if(tempnum == 6){
        		numbercount[2]++;
        		numbercount[3]++;
        	}
        	else if(tempnum==8){
        		numbercount[2]+=3;
        	}
        	else if(tempnum==9) {
        		numbercount[3]+=2;
        	}
        	else{
        		numbercount[tempnum]++;
        	}
        }
        return numbercount;
    }
    
    static void findrightmostnonzero(int numbercount[]){
    	
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        long A[] = new long[N];
		        for(int j=0;j<N;j++){
		            A[j] = sc.nextLong();
		        }
		        int temp[] = findlastdigit(A,N);
		        findrightmostnonzero(temp);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}