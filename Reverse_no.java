package cb;
import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number you want to reverse");
		int n = scn.nextInt();
		int x = 0;
		while(n != 0) {
			int rem = n%10;
			x = x*10 + rem;
			n = n/10;
		}
		
		System.out.println(x);
		
		
	}
	

}
