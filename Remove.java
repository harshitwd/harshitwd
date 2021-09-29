package thinkQ;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int []arr = {5,23,11,44,22,42,48};
		
		int n = scn.nextInt();
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==arr[n]) {
				continue;
			}
			else {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
