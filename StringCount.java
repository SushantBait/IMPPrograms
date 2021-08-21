
public class StringCount {

	public static int charCount(String string){
		int count = 0;  
		
		for(int i = 0; i < string.length(); i++) {  
		    if(string.charAt(i) != ' ')  
		        count++;  
		}  
		return count;
	}
	
	public static int wordCount(String string){
		int count = 0;  
		
		String[] s=string.split(" ");
		for(int i=1;i<s.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
	
		String string = " The best of both worlds ";  
		
		System.out.println("Total number of characters in a string: " + charCount(string));  
		System.out.println("Total number of words in given String : "+ wordCount(string));
	}
}

  