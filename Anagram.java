import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1,String s2){
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result=Arrays.equals(a,b);
		return result;
	}
	
	public static void main(String[] args) {
		
		if(isAnagram("sush", "shsu")==true){
			
			System.out.println();
		}

	}
}
