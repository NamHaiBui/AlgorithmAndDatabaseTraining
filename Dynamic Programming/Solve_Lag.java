package ICPC;

import java.util.Scanner;

public class Solve_Lag {
	public static void main(String[] args) {
		String input = "3\r\n"
				+ "1 1\r\n"
				+ "2 2\r\n"
				+ "6 3\r\n"
				+ "";
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String empty  = sc.nextLine();
		int[] arrivalTime = new int[n];
		int[] arrivalPack = new int[n];
		int[] arrivals = new int[n+1];
		for(int i = 0; i < n; ++i) {
			arrivalTime[i]= sc.nextInt();
			arrivalPack[i]= sc.nextInt();
		}
		
		for(int i = 0; i < n; ++i) {
			arrivals[arrivalPack[i]] = arrivalTime[i] ;
		}
//		System.out.println(Arrays.toString(arrivals));
		arrivals[0] = 0;
		int curTime = 0;
		int lagTime = 0;
		for (int i = 0; i <= n; ++i) {
			if (arrivals[i] > curTime) {
				lagTime += arrivals[i] - curTime;
				curTime = arrivals[i] + 1;
			}else {
				curTime += 1;
			}
		}
		System.out.println(lagTime);
	}
}
