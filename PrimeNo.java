
public class PrimeNo {
	
	public static boolean isPrime(int num){
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; i++) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
		return flag;
	}
	
	public static void main(String[] args) {
		int num=29;
		
	if(isPrime(num)==true){
		System.out.println("Prime Number");
	}
		
	}
}
