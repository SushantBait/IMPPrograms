
public class ArmstrongNo {
	public static int isArmstrong(int num){
		int mod=0,sum=0;
		for(;num>0;num/=10){
		mod=num%10;
		sum+=(mod*mod*mod);
		}
		return sum;
	}
	public static  int isArmstrongByWhile(int num){
		int mod=0,sum=0;
		while(num>0){
			mod=num%10;
			num=num/10;
			sum+=(mod*mod*mod);
		}
		return sum;
	}
	public static void main(String[] args) {
		  int num=153;
		  if(isArmstrong(num)==num){
			  
			  System.out.println("is Armstrong Number");
		  }
		  else
		  {
			  System.out.println("is Not Armstrong Number");
		  }

	}
}
