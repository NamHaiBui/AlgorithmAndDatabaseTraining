package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_A {
public static void main(String[] args) {
	String test ="8 10\r\n"
			+ "1\r\n"
			+ "2L\r\n"
			+ "3\r\n"
			+ "4\r\n"
			+ "3L\r\n"
			+ "1\r\n"
			+ "1L\r\n"
			+ "4L\r\n"
			+ "";
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int tank =sc.nextInt();
	String empty = sc.nextLine();
	int count = 0;
	String[] orders = new String[n];
	
	for(int i =0; i <n; ++i) {
		orders[i] = sc.nextLine();
	}
	int currTank = tank;
	int waterCon = 0;
	int i = 0;
	while(i < orders.length){
		if(orders[i].length() == 1) {
			waterCon = Integer.parseInt(orders[i]);
		}else {
			waterCon = Integer.parseInt(orders[i].substring(0,1)) + 1;
//			System.out.println(waterCon);
		}
//		System.out.println(waterCon);
		if (currTank - waterCon >= 0) {
			currTank -= waterCon;
			i+=1;
		} else {
			currTank = tank;
			count += 1;
		}
		
	}
	System.out.println(count);
}
}
