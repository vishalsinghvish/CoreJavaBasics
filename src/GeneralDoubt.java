import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneralDoubt {

	public static void main(String[] args) {
		int[] arr= new int[10];
		arr[0]=3;
		System.out.println(arr.length);
		List<Integer> ll=new LinkedList<>();
		ll.add(10);
		System.out.println(ll.size());
		ll=new ArrayList<>();
		ll.add(1);
		ll.add(9);
		System.out.println(ll.size());
	}

}
