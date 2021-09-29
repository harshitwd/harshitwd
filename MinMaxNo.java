package thinkQ;

import java.util.Arrays;

public class MinMaxNo {

	public static void main(String[] args) {
		int [] arr = {13,11,44,24,122,15};
		Arrays.sort(arr);
		System.out.println( "Minimum no. : " +arr[0] + " Largest No. :" + arr[arr.length-1] );

	}

}
