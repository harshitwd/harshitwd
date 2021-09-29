package cb;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int divident = scn.nextInt();
		
		while(divident%divisor != 0) {
		    int rem = divident%divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println( "the gcd is "+ divisor );

	}

}
