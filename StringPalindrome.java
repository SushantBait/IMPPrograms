

import java.util.Scanner;

public class StringPalindrome {
	static String reverseByStringBuffer(String str){
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse().toString();
	}	
	static String reverseByStringBuilder(String str){
		StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString();
	}
	static String reverseByChatAt(String str){
		String revString = "";
		  for (int i=str.length()-1;i>=0;--i) {
		   revString += str.charAt(i);
		  }
		  return revString;
	}
	static String reverseByCharArray(String str){
		char[] ch=str.toCharArray();
		String revString="";
		for(int i=ch.length;i>0;i--)
		{
			revString+=ch[i-1];
		}
		return revString;
	}
	static String reversebyRecursion(String str){
		if(str.length()<2){
			return str;
		}
		return reversebyRecursion(str.substring(1))+str.charAt(0);
	}
	static String reverseByCollection(String str){
		List<Character> list = new ArrayList<Character>();
		 for (char c: str.toCharArray()) {
	            list.add(c);
	        }
		 Collections.reverse(list);
		 StringBuilder builder = new StringBuilder(list.size());
	        for (Character c: list) {
	            builder.append(c);
	        }
	 
	        return builder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String :");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		if(reverseByChatAt(s).equals(s)||reverseByStringBuffer(s).equals(s)||reverseByStringBuilder(s).equals(s)){
			System.out.println("is Palindrome ");
		}
		else
		{
			System.out.println("is Not Palindrome ");
		}
		
	}

}
