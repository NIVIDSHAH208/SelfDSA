import java.util.Scanner;

public class MainMethod {
	static Scanner in = new Scanner(System.in);;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Please enter the number n>>");
//		int n = in.nextInt();
//		System.out.println(myFib(n));
		
		findOccur();
		
	}
	
	//find occurance of the number
	public static void findOccur() {
		
		System.out.println("Please enter the number >>");
		int number = in.nextInt();
		System.out.println("Please enter the number we want to find>>");
		int findA = in.nextInt();
		int rem=0;
		
		int counter = 0;
		while(number>0) {
			rem = number %10;
			number = number/10;
			
			if(rem==findA) {
				counter++;
			}
		}	
		System.out.println("Number of occurence are: "+counter);
		
	}
	

	
	
	//fibonacci series
	public static int myFib(int n) {
		int firstNum = 0;
		int secondNum = 1;
		int fibNum = 0;
		if(n==0||n==1) {
			return n;
		}
		else {
			for(int i=1; i<n;i++){
	            fibNum = firstNum + secondNum;         
	            firstNum = secondNum;
	            secondNum = fibNum;
	        }
	        return fibNum;
		}
	}
}
