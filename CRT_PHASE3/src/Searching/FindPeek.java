package Searching;
import java.util.*;
public class FindPeek {

	public static void main(String[] args) {
		ArrayList<Integer> Ar = new ArrayList<>(Arrays.asList(2,3,5,60,6,2,2,5,50,25,43));
		int start =0 , end = Ar.size()-1;
		int mid = start+(end-start)/2;
		int init=mid;
		System.out.println(Ar);
		while(start<end) {
			if((Ar.get(mid)>Ar.get(mid-1)) && (Ar.get(mid)>Ar.get(mid+1))  ) {
				System.out.println("The Peek Element is : " + Ar.get(mid));
				break;
			}
			else if (Ar.get(mid)<Ar.get(mid-1)) {
				end = mid;
			}
			else{
				start = mid;
			}
			mid = start+(end-start)/2;
		}
		
//		Integer prime = 20;
//		
//		for(Integer i=2;i<29;i++) {
//			if(prime%i==0) {
//				System.out.println("Not Prime");
//				break;
//			}
//		}
	}

}

//an array will be given number of pages of different books his pages are given in ascending order
// 4 books with no.of pages [ 10,20,30,40 ] should be allocated to student 
// each should have at least 1 student,
// No multi allocation
// Continous Order of allocate 


//find the max number of pages alocated to the should be minimum 

// cows
// Angry Birds













