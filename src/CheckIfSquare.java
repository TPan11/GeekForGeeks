import java.util.*;
//import java.lang.*;
//import java.io.*;

class CheckIfSquare {
    static double distance(double A[], double B[]) {
        double x = A[0] - B[0];
        double y = A[1] - B[1];
        double result = Math.sqrt((x*x) + (y*y));
        return result;
    }
    
    static boolean is_square(int points[]) {
        double A[] = {points[0], points[1]};
        double B[] = {points[2], points[3]};
        double C[] = {points[4], points[5]};
        double D[] = {points[6], points[7]};
        
        double AB = distance(A,B);
        double AC = distance(A,C);
        double AD = distance(A,D);
        
        if (AB == AC) {
        	double BC = distance(B,C);
        	if(BC != AD) {
        		return false;
        	}
        	else {
        		double CD = distance(C,D);
        		double BD = distance(B,D);
        		if(CD == BD) {
        			return true;
        		}
        		else
        			return false;
        	}
        }
        else if(AB == AD) {
        	double BD = distance(B,D);
        	if(BD != AC) {
        		return false;
        	}
        	else {
        		double CD = distance(C,D);
        		double BC = distance(B,C);
        		if(CD == BC) {
        			return true;
        		}
        		else
        			return false;
        	}
        }
        
        else if(AC == AD){
        	double CD = distance(C,D);
        	if(CD != AD) {
        		return false;
        	}
        	else {
        		double BD = distance(C,D);
        		double BC = distance(B,C);
        		if(BD == BC) {
        			return true;
        		}
        		else
        			return false;
        	}
        }
        else
        	return false;
        
    }

    
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i = 0;
		while(i<T) {
		    int points[] = new int[8];
		    for(int j =0; j<8;j++) {
		        points[j] = sc.nextInt();
		    }
		    boolean flag = is_square(points);
		    if(flag) {
		        System.out.println("1");
		    }
		    else
		        System.out.println("0");
		    i++;
		}
		sc.close();
	}
}