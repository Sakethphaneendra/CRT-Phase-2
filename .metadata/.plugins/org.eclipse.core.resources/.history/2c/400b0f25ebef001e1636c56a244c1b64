package Searching;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> Ar = new ArrayList<>(Arrays.asList(12,54,2,13,43,1));
		Collections.sort(Ar);
		System.out.println(Ar);
		int size = Ar.size();
		int start = 0 ,end = size-1,mid,target=13;
		System.out.println("Target Element : "+target);
		while(start<=end) {
			size = start+(end-start)/2;
			mid = (start +end)/2;
			if(Ar.get(mid)==target) {
				System.out.println("Element Found at Index : "+mid);break;
			}
			else if(Ar.get(mid)>target) {
				end= mid-1;
			}
			else if (Ar.get(mid)<target){
				start = mid+1;
			}			
		}
	}
}




/*
 * [1,4,4,4,9,13,15,15] Using BS find the first and last of 4 and 15
 * */
 