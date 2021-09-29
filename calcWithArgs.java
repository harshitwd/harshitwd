package thinkQ;

public class calcWithArgs {

	public static void main(String[] args) {
		add();
		sub(10,20);
		int multiResult = multi(5,60);
		int divideResult = divide(18,2);
		System.out.println( "multiply :" + multiResult);
		System.out.println("divide : " + divideResult);
	}
	
	public static void add() {
		int firstNo = 5;
		int secondNo = 6;
		int sum = firstNo + secondNo;
		System.out.println("add :" + sum);
	}
	
	public static void sub(int n ,int z) {
		
		int sub = z - n ;
		System.out.println("sub :" +z);
	}
	
	public static int multi(int a , int b) {
		int multi = a*b;
		return multi;
	}
	
	public static int divide(int x, int y) {
		int div = x/y;
		return div;
	}
	

}
