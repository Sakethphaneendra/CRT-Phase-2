package Sorting;
import java.util.*;
public class SelectionSort {
	public static void main(String[] args) {
//		Selection Sort
		ArrayList<Integer> Ar = new ArrayList<>(Arrays.asList(13,32,53,52,2,54,23,64,23,4));
		for(int i=0;i<Ar.size();i++) {
			int min = Ar.get(i);
			for(int j=i+1;j<Ar.size();j++) {
				if( min < Ar.get(j)) {
					min = Ar.get(j);
				}
				Ar.set(i, min);

			}
		}
		System.out.println(Ar);
	
	}

}
