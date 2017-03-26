import java.util.*;
//import java.lang.*;
//import java.io.*;

class CheckPanagram {
    
    static void checkpanagram(String str) {
		str = str.toLowerCase();
		for(char alphabet='a'; alphabet<='z'; alphabet++) {
			if(str.indexOf(alphabet) == -1){
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
    
	public static void main (String[] args) {
		//code
		try {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    String str = new String();
		    sc.nextLine();
		    for(int i=0; i<T; i++) {
		    	str = str + sc.nextLine() + "\n";
		    }
		    Scanner sc2 = new Scanner(str);
		    for(int i=0; i<T; i++) {
		    	checkpanagram(sc2.nextLine());
		    }
		    sc2.close();
		    sc.close();
		}
		catch(Exception e) {
	        System.out.println("Exception in main " + e);
	    }
	}
}