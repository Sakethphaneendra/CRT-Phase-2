package SearchingPrograms;
import java.util.*;
public class PageAllocationUsingBS {

	public static void main(String[] args) {
		ArrayList<Integer> BK = new ArrayList<>(Arrays.asList(10,20,30,40));
		int TotalPages = 0;
		int Student1 = 0,Student2 =0;
		for(int i=0;i<BK.size();i++) {
			TotalPages = TotalPages + BK.get(i);
		}
		System.out.println(TotalPages);
		int start =0, end = TotalPages,mid=0;
	
		mid = start+(end-start)/2;
		end = mid;
		for(int i=0;i<BK.size();i++) {
			if(Student1<=mid) {
				Student1 = Student1+BK.get(i);
			}
			else{
				if(Student2<=mid) {
					Student2 = Student2+BK.get(i);
				}
				else {
					start = mid;
				}
			} mid=end;
		}
	
		if(Student1 >=1)				
		System.out.println(start +" "+ end);
		
	}

}
