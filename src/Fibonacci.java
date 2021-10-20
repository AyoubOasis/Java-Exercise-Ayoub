
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 12;
		System.out.println(fib(n));
	}
	
	static int fib(int n) {
		if (n<=1) {
			return n;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}

}
