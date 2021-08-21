import java.util.Arrays;

public class NumberPalindrome {
	public static boolean isPalindrome(int num){
		int mod,sum=0,val=num;
		while(num>0)
		{
			mod=num%10;
			num=num/10;
			sum=sum*10+mod;
		}
		return val==sum;
	}

	public static void main(String[] args) {
		int num=121;
		if(isPalindrome(num)==true){
		System.out.println("Is Palindrome");
		}
	}
}