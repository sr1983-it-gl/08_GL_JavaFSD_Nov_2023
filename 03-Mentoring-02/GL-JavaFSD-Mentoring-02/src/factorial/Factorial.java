package factorial;

public class Factorial {

	public static int factorial(int n) {
	
		if (n == 0 || n == 1) {
			return n;
		}else {
			int tValue1 = factorial(n - 1);
			int tValue2 = n * tValue1;
			return tValue2;
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println(factorial(6));
	}
}
