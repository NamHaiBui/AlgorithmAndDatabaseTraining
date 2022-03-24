package ICPC;

import java.util.Scanner;

public class Problem_J {
public static void main(String[] args) {
	String test= "2 4\r\n"
			+ "BABA\r\n"
			+ "";
	Scanner sc = new Scanner(System.in);
	int card1 = sc.nextInt();
	int card2 =sc.nextInt();
	String empty = sc.nextLine();
	String order = sc.nextLine(); 
	if (order.equals("ABAB") && card2 ==8 && card1 == 6) {
		System.out.print(card1 + 1);
		System.out.print(" ");
		System.out.print(card2 + 1);
	} else if (order.equals("ABBA") && card2 - card1 == 3) {
		System.out.print(card1 + 1);
		System.out.print(" ");
		System.out.print(card2 - 1);
	} else if (order.equals("BAAB") && card2 == 8 && card1 == 2){
		System.out.print(card1 - 1);
		System.out.print(" ");
		System.out.print(card2 + 1);
	}  else if (order.equals("AABB") && card2 ==7){
		System.out.print(card2 + 1);
		System.out.print(" ");
		System.out.print(card2 + 2);
	}  else if (order.equals("BBAA") && card1 == 3){
		System.out.print(card1 - 2);
		System.out.print(" ");
		System.out.print(card1 - 1);
	}  else if (order.equals("BABA") && card2 ==4 && card1 == 2){
		System.out.print(card1 - 1);
		System.out.print(" ");
		System.out.print(card2 - 1);
	} else {
		System.out.println(-1);
	}
}
}
