package thinkQ;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] n = { 5, 4, 12, 8, 9,10, 43, 7, 3, 1 };
		int []result=min(n);
		int add = 0;
		for (int sum = 0; sum <
				result.length - 2; sum++) {
			add = add + result[sum];
		}
		System.out.println(add);

	}

	public static int [] min(int[] n) {
		for (int counter = 1; counter < n.length; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= n.length - 1; j++) {
				if (n[j] < n[min]) {
					min = j;
				}
			}
			int temp = n[min];
			n[min] = n[counter];
			n[counter] = temp;
		}
		return n;
	}

}
