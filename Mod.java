package thinkQ;
import java.util.Scanner;
public class Mod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2 == 0) {
			System.out.println(n +"  is a even no.");
		}else {
			System.out.println(n + " is a odd no.");
		}

	}

}
