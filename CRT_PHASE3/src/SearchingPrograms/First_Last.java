//[1,4,4,4,9,13,15,15] Using BS find the first and last of 4 and 15
package SearchingPrograms;
import java.util.*;
public class First_Last {
	public static void main(String[] args) {
		ArrayList<Integer> Ar = new ArrayList<>(Arrays.asList(1,3,4,5,5,6,3,3,5,6,6,3,4,5,3));
		Collections.sort(Ar);
		BS(Ar,5);
	}
	public static void BS(ArrayList<Integer> Ar,int target) {
		int size = Ar.size();
		int start = 0 , end  = size; int mid;
		System.out.println(Ar);

		while(start<end) {
			mid = start+(end-start)/2;
			int First =1;
			if(Ar.get(mid) == target){
				start = mid;
				System.out.println("Last Index : " +start);
				for(int j=mid;j>=0;j--) {
					if(Ar.get(j)==target) {
						 First = j;
					}
				}
				System.out.println("First Index : "+First);

				break;
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
