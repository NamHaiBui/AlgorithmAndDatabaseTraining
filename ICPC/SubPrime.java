package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class SubPrime {
	public static int[] PrimeGen(int start, int end) {
		int s = start;
		int e = end;
		int d = 3;
		int[] primeArr = new int[e];
		primeArr[0] = 2;
		int x = 1;
		while(x !=primeArr.length) {
			if(isPrime(d)) {
				primeArr[x] = d;
				x+=1;
			}
//			System.out.println(d);
			d+=2;
		}
		int[] processedPrimeArr = new int[end-start+1];
		for (int i = 0; i < processedPrimeArr.length; i++) {
			processedPrimeArr[i] = primeArr[start-1 + i];
        }
		return processedPrimeArr;
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2; i<=Math.sqrt(n);i++) 
	    {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
		String input = "1 1000\r\n"
				+ "00\r\n"
				+ "";
		Scanner sc = new Scanner(System.in);
		String[] sAe = sc.nextLine().split(" ");
		int start = Integer.parseInt(sAe[0]);
		int end = Integer.parseInt(sAe[1]);
		String subString = sc.nextLine();
		int[] primeArr = PrimeGen(start,end);
//		System.out.println(Arrays.toString(primeArr));
		int count = 0;
		for(int i:primeArr) {
			if(String.valueOf(i).contains(subString)) {
				count +=1;
			}
		}
		System.out.println(count);
		
	}
}
