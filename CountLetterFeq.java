package thinkQ;

import java.util.Scanner;

public class CountLetterFeq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scn.nextLine();

		count(str);

	}

	public static void count(String str) {
		char arr[] = str.toCharArray();
		int count = 0;
		int[] freq = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (arr[i] == arr[j]) {

					freq[i]++;
					arr[j] = '0';

				}
			}
		}

		for (int i = 0; i < freq.length; i++) {
			if (arr[i] != ' ' && arr[i] != '0') {
				System.out.println(arr[i] + "--" + freq[i]);
			}
		}
	}

}
