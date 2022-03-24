package ICPC;

import java.util.Scanner;

public class Problem_B {
public static void main(String[] args) {
	String test = "0830";
	Scanner sc = new Scanner(System.in);
	String time = sc.nextLine();
	int FHour = Integer.parseInt(time.substring(0,1));
	int SHour = Integer.parseInt(time.substring(1,2));
	int FMin = Integer.parseInt(time.substring(2,3));
	int SMin =  Integer.parseInt(time.substring(3,4));
	int[] Time = {FHour, SHour, FMin, SMin};
	String[][] lines = new String[4][4];
	for(int i  = 0; i < 4; ++i) {
		for(int j  = 0; j < 4; ++j) {
			lines[i][j] = ".";
		}
	}
		for(int j  = 0; j < 4; ++j) {
			while(Time[j] >0) {
//				System.out.println(Time[j]);
				if(Time[j] - 8 >= 0) {
					Time[j] -=8;
					lines[0][j] = "*";
				}
				if(Time[j] - 4 >= 0) {
					Time[j] -=4;
					lines[1][j] = "*";
				}
				if(Time[j] - 2 >= 0) {
					Time[j] -=2;
					lines[2][j] = "*";
				}
				if(Time[j] - 1 >= 0) {
					Time[j] -=1;
					lines[3][j] = "*";
				}
				
			}
		
	}
	
	
	for(int i  = 0; i < 4; ++i) {
		String line ="";
		for(int j  = 0; j < 4; ++j) {
			line += lines[i][j];
			if(j <3) {
			line += " ";
			}
			if(j == 1) {
				line +="  ";
			}
		}
		System.out.println(line);
	}
	
}
}
