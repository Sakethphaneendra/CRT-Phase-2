package Searching;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		ArrayList<Integer> Ar = new ArrayList<>(Arrays.asList(12,32,43,12,43,34,2,32,32,6,8,23,56));
		int Target = 12;
		for(int i=0;i<Ar.size()-1;i++) {
			if(Ar.get(i)==Target) {
				System.out.println("Element Found");
				break;
			}
		}
	}
}
