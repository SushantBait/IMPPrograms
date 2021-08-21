import java.util.Scanner;

public class FibonacciNumber {

	public static void fiboNo(int n){
		int num1=0,num2=1;
	    // sc.close();
	        System.out.print("First " + n + " terms: ");

	        for (int i = 1; i <= n; i++)
	        {
	            System.out.print(num1 + " , ");

	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	        }
	    }

	public static void main(String[] args) {
		int n;
	//	System.out.println("Enter How many no you have to print:");
		Scanner sc=new Scanner (System.in);
		System.out.println("How many numbers do you have to print:");
		n=sc.nextInt();
		sc.close();
		fiboNo(n);
	}
}
