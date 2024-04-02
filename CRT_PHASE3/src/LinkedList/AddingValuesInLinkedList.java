package LinkedList;
import java.util.*;
public class AddingValuesInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> L = new LinkedList<>(Arrays.asList("A","B","C","D"));
//		display(L);
		CustArryList();
	}
	public static void display(LinkedList<String> D) {
			for(String dd : D) {
				System.out.println(dd);
			}
	}
	public static void CustArryList() {
		Scanner in = new Scanner(System.in);
		LinkedList<String> L2 = new LinkedList<>();
		ArrayList<Integer> input = new ArrayList<>();

		while(in.hasNextInt()) {
			input.add(in.nextInt());
		}
		for(Integer c : input) {
			System.out.println(c);
		}
		
	}
	

	
}
//LinkedList 4 nodes Display in Function head pointer but java support pointers. 