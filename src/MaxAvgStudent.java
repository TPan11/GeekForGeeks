import java.util.*;
//import java.lang.*;
//import java.io.*;

class MaxAvgStudent {
    
    static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    
    static void maxmarksstudent(String A[][], int N){
        String student = "";
        int maxmarks= 0;
        for(int i=0; i<N; i++){
            int avg = average(Integer.parseInt(A[i][1]), Integer.parseInt(A[i][2]), Integer.parseInt(A[i][3]));
            if(avg > maxmarks){
                student = (A[i][0]);
                maxmarks = avg;
            }
        }
        System.out.println(student + " " + maxmarks);
    }
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=0; i<T; i++) {
		        int N = sc.nextInt();
		        String A[][] = new String[N][4];
		        for(int j =0; j<N; j++){
		            A[j][0]=sc.next();
		            A[j][1]=sc.next();
		            A[j][2]=sc.next();
		            A[j][3]=sc.next();
		        }
		        maxmarksstudent(A, N);
		    }
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}