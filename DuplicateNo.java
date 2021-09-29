package thinkQ;

import java.util.Scanner;

public class DuplicateNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		//int temp = int arr[n];
		//duplicate(arr,temp);
	}
		static void duplicate(int[] arr, int[]temp){
			for(int j = 0; j<arr.length ; j++) {
				for(int z = j+1; z<arr.length; z++) {
					if(arr[j] ==arr[z]) {
			//			int temp[j]
					}
				}
			}
		}
		


}
