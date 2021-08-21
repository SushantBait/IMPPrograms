
public class SumOfDigit {
	public static int isOdd(int[] num){
		int sum=0;
	
		for(int i=0;i<num.length;i++){  
			if(num[i]%2!=0){  
			sum=sum+num[i];  
			}  
		}
		return sum;
   }
	public static int isEven(int[] num){
		int sum=0;
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0){
				sum=sum+num[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {	
		int[] num={1,2,5,6,3,2};  
		 
		System.out.println("Addition of Odd No:"+isOdd(num));
		System.out.println("Addition of Even No:"+isEven(num));
	}
}
