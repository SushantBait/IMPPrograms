import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargeNo {

	public static int secondLarge(List<Integer> list){
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		Arrays.sort(arr);
		
		return arr[arr.length-2];
	}
	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(90);
		list.add(50);
		list.add(40);
		System.out.println("Second Largest Number : "+secondLarge(list));
	}
}
