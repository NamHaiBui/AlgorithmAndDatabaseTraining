package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_C {
	public static int Testing(int a, int b) {
		if (b == 0) return a;
		return Testing(b, a%b);
	}
public static void main(String[] args) {
	String test ="3 9 5\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "3\r\n"
			+ "";
	String test2 ="3 10 2\r\n"
			+ "5\r\n"
			+ "6\r\n"
			+ "7\r\n"
			+ "";
	Scanner sc = new Scanner(test2);
	int n = sc.nextInt();
	int[] sessionTime = new int[n];
	int p = sc.nextInt();
	int k = sc.nextInt();
	for(int i =0; i <n; ++i) {
		sessionTime[i]=sc.nextInt();
	}
	int total = 0;
	for(int i = 0; i <n; ++i) {
		total += sessionTime[i];
	}
//	System.out.println(total);
	int count = 0;
	int dayTime = p;
	int currStu = 0;
	int tracker = 0;
	int routine = 0;
//	int kekw = (total * p/Testing(total,p));
//	int sessionPerRoutine = kekw / total;
//	int totalTime = k *p;
//	k = totalTime % kekw / p;
	for(int i = 0; i < k; ++i) {	
		while(dayTime - sessionTime[currStu] >= 0) {
			dayTime -= sessionTime[currStu];
			currStu += 1;
			if(currStu >= n) {
				currStu = 0;
				count += 1;
			}
		}
		tracker+=1;
		dayTime = p;
		if(currStu == 0) {
			routine = tracker; 
			break;
		}
		
	}
	
	int Scount = 0;
	
	if(routine != 0) {
		k = k % routine;
		for(int i = 0; i < k; ++i) {	
			while(dayTime - sessionTime[currStu] >= 0) {
				dayTime -= sessionTime[currStu];
				currStu += 1;
				if(currStu >= n) {
					currStu = 0;
					Scount += 1;
	//				System.out.println(currStu);
				}
			}
			dayTime = p;
	}
	System.out.println(routine * count + Scount);
	}
	else {
	System.out.println(count);
	}
	
}
}
