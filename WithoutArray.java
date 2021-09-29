package thinkQ;

import java.util.Arrays;

public class WithoutArray {

	public static void main(String[] args) {
		int[] arr = { 25, 11, 8, 5, 42, 40 };
		int[] show = min(arr);
		System.out.println( "Minimum no. : " +show[0] + " Largest No. :" + show[show.length-1] );

		// System.out.println(Arrays.toString(show));
		for (int i = 0; i < show.length; i++) {
			System.out.print(show[i] + " ");
		}

	}

	public static int[] min(int[] n) {
		for (int counter = 0; counter < n.length; counter++) {
			int min = n[counter];
			for (int j = counter + 1; j < n.length; j++) {
				if (n[counter] >  n[j]) {

					int temp = n[j];
					n[j] = n[counter];
					n[counter] = temp;
				}
			}
		}
		return n;
	}

}
