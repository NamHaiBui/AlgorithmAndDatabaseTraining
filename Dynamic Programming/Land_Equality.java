package ICPC;

import java.util.ArrayList;
import java.util.Scanner;

public class Land_Equality {
	/**
	 * if n == 0
			min of rest of array
		n = index of 2's in array 
		if n is even  __. 0
		if n is odd --> n ^[n/2] - 2^[n/2]
		n = 2k +1
		2^(k +1) - 2^(k)
	 */
	public static void main(String[] args){

	    String test0 = "3 4\n1 2 1 1\n2 2 1 2\n1 2 2 2";
	    String test1 = "2 7\n 2 2 2 2 2 2 2\n 1 0 1 2 2 1 1 ";
	    String test2 = "1 2\n 1 2";
	    String test3 = "3 4\n 2 1 1 1\n1 1 1 2\n1 1 1 1";
	    String test5 = "2 3\r\n"
	    		+ "0 1 2\r\n"
	    		+ "0 1 2\r\n"
	    		+ "";
	    String test6 = "3 1\n 0\n 0\n 0 ";
	    
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y= sc.nextInt();
	    if( x > 1 && y > 1){
	    	normal(x*y, sc);
	    } else{
	      ArrayList<Integer> vals = new ArrayList<>();

	      int[] counts = new int[3];
	      for(int i = 0; i < x*y; ++i){
	        int val = sc.nextInt();
	        vals.add(val);
	        counts[val]++;
	    }
	    if(counts[0] > 1){
	      System.out.println(0);
	    }else if(counts[0] == 1){
	    	if(vals.get(0) == 0){
		        System.out.println(vals.get(x*y-1));
		      }else if(vals.get(x*y-1) == 0){
		        System.out.println(vals.get(0));
		      }else{
		        System.out.println(Math.min(vals.get(0),vals.get(x*y-1)));
		      }
		}else{ 
			if(counts[2] % 2 == 0){
			    System.out.println(0);
		      }else{
				System.out.println(1 << (int)Math.floor(counts[2]/2));    
		      }
	    }	      
	    }
	  }

	  public static void normal(int size, Scanner sc){
	    
	    int[] counts = new int[3];
	    for(int i = 0; i < size; ++i){
	      counts[sc.nextInt()]++;
	    }

	    if( counts[0] > 1){
	      System.out.println(0);
	    }else if(counts[0] == 1){
	      if(counts[1] > 0){
	        System.out.println(1);
	      }else{
	        System.out.println(2);
	      }
	    }else{
	      if(counts[2]%2==0){
	        System.out.println(0);
	      }else{
	        //2^ (counts/2)
	        System.out.println(
	          1<<(int)Math.floor(counts[2]/2)
	        );
	      }
	      
	    }
}
}
