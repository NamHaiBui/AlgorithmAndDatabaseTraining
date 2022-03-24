package ICPC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem_M {
	public static void main(String[] args) {
		String test= "5\r\n"
				+ "1 1\r\n"
				+ "3 2\r\n"
				+ "4 5\r\n"
				+ "4 3\r\n"
				+ "5 4\r\n"
				+ "";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<Integer,ArrayList<Integer>> packets = new HashMap<>();
		
		for(int i = 1; i <= n; ++i) {
			int time = sc.nextInt();
			int value =sc.nextInt();
			if(!packets.containsKey(time)) {
				packets.put(time, new ArrayList<>());
			}
			packets.get(time).add(value);
		}
//		System.out.println(packets);
		int currTime = 1;
		int lagTime = 0;
		int nextPack = 1;
		ArrayList<Integer> currPac = new ArrayList<>(); 
		while(nextPack <= n) {
			if(packets.containsKey(currTime)) {
				for(int i:packets.get(currTime)) {
					currPac.add(i);
				}
			}
//			System.out.println(currPac);
			if(currPac.contains(nextPack)) {
				nextPack+=1;
			} else {
				lagTime +=1;
			}
			currTime += 1;
//			System.out.println(currTime + " " + nextPack + " " + lagTime);
		}
		System.out.println(lagTime);
	}
}
