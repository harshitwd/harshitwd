package cb;
import java.util.Scanner;

public class fabonnacii {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the nth time you want the series");
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		
		int counter = 0 ;
		while(counter<=n+1) {
			System.out.println(a);
			int sum = a+b;
			a = b;
			b = sum;
			counter++ ;
		}
		
		
	
	}
	

}
