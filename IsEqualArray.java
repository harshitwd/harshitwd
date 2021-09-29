package thinkQ;

import java.util.Arrays;

public class IsEqualArray {

	public static void main(String[] args) {
		int[] arr1 = { 5, 4, 3, 23, 28 };
		int[] array2 = { 5, 4, 3, 23, 28 };
		if(sort(arr1, array2)) {
			
			Arrays.sort(arr1);
			Arrays.sort(array2);
			
			System.out.print(Arrays.toString(arr1));
			System.out.print(Arrays.toString(array2));
		}
		else {
			System.out.println(" Not Equal");
		}
	}

	static boolean sort(int[] arr1, int[] array2) {
		int count = 0;
		int n = arr1.length;
		int m = array2.length;
		if (n != m) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			if (arr1[i] == array2[i]) {
				count = 1;
			} else {
				count = 0;
			}
		}
		if (count == 1) {
			System.out.println("Array equals");
		} else {
			System.out.println("Not equals");
		}
		return true;

	}
}
