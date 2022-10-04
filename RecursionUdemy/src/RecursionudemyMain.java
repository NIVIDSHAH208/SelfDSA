import java.util.Scanner;

public class RecursionudemyMain {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("How Many russian dolls>>> ");
//		int num= in.nextInt();
//		openRussianDoll(num);

		// Observe the stack
//		firstMethod();

//		System.out.println(powerOfTwoRecursion(1));
//		System.out.println(powerOftwoIteration(1));
//		System.out.println("Factorial is: "+ findFactorial(2));
//		System.out.println("Nth fib number is: "+findFibonacci(-2));
		System.out.println("Sum of any number is: "+findSum(99));
	}
	
	//sum of any digits
	static int findSum(int num) {
		if(num<=0) {
			return 0;
		}else {
			int sum=0;
			sum+=num%10+findSum(num/10);
			return sum;
		}
		
	}

	// find fibonacci using recursion
	static int findFibonacci(int num) {
		if (num < 0) {
			return -1;
		} else if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			int fib = 1;
			fib = findFibonacci(num-2)+findFibonacci(num-1);
			return fib;
		}
	}

	// example of russian doll
	static void openRussianDoll(int n) {
		if (n == 1) {
			System.out.println("All dolls are opened!");
		} else {
			System.out.println("Doll number: " + n + " is opened!");
			// Recursive call to method itself
			openRussianDoll(n - 1);
		}
	}

	// find factorial
	static int findFactorial(int num) {
		if (num < 0) {
			return -1;
		} else if (num == 0) {
			return 1;
		} else {
			int mul = 1;
			mul = num * findFactorial(num - 1);
			return mul;

		}
	}

	// basic recursion call
//	static String recursionmethod(String[] params) {
//		if(condition) {
//			return something;
//		}else {
//			recursionmethod(modified_params)
//		}
//	}

	// power of two
	static int powerOfTwoRecursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			int sum = 0;
			sum = 2 * powerOfTwoRecursion(n - 1);
			return sum;
		}
	}

	static int powerOftwoIteration(int n) {
		if (n == 0) {
			return 1;
		} else {
			int sum = 2;
			for (int i = 1; i < n; i++) {
				sum *= 2;
			}
			return sum;
		}
	}

	static void firstMethod() {
		secondMethod();
		System.out.println("I am first Method");
	}

	static void secondMethod() {
		thirdMethod();
		System.out.println("I am second Method");
	}

	static void thirdMethod() {
		forthMethod();
		System.out.println("I am third Method");
	}

	static void forthMethod() {
		System.out.println("I am forth Method");
	}

}
