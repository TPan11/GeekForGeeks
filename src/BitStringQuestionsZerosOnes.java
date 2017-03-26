import java.util.*;
//import java.lang.*;
//import java.io.*;

class BitStringQuestionsZerosOnes {
    
    static int count_blanks(String str) {
        int count = 0;
        int index = -1;
        do {
            index = str.indexOf('?',index+1);
            if(index>=0)
                count++;
        }while(index!=-1);
        return count;
    }
    
    static void addzero(String str, int count){
        int index = str.indexOf('?');
        String newstr = str.substring(0,index) + '0' + str.substring(index+1);
        if(count!=0){
            addzero(newstr,count-1);
            addone(newstr,count-1);
        }
        else {
            System.out.print(newstr + " ");
        }
    }
    
    static void addone(String str, int count){
        int index = str.indexOf('?');
        String newstr = str.substring(0,index) + '1' + str.substring(index+1);
        if(count!=0){
            addzero(newstr,count-1);
            addone(newstr,count-1);
        }
        else {
            System.out.print(newstr + " ");
        }
    }
    
	public static void main (String[] args) {
		//code
		try{
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i =0 ; i< T;i++) {
		        String str = sc.next();
		        int count = count_blanks(str);
		        //System.out.println(count);
		        if(count == 0)
		        	System.out.print(str);
		        else {
		        	addzero(str,count-1);
		        	addone(str,count-1);
		        }
		        System.out.println();
		    }       
		    sc.close();
	    }
	    catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}