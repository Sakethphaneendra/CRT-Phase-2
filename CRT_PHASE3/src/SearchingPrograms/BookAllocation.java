package SearchingPrograms;
import java.util.*;
public class BookAllocation {
	public static void main(String[] args) {
		ArrayList<Integer> bookpages = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		int mark = 1;
		ArrayList<Integer> StudentMax = new ArrayList<>();
		int S1 =0;
		int S2=0;
		for(int j=0;j<bookpages.size()-1;j++) {
		for(int i=0;i<mark;i++) {
			S1 = S1 + bookpages.get(i);
		}
		for(int i=mark;i<bookpages.size();i++) {
			S2 = S2 + bookpages.get(i);
		}
		if(S2>S1) {
			StudentMax.add(S2);
		}else {
			StudentMax.add(S1);
		}	
		S1=S2=0;
		mark++;
		}
		System.out.println(StudentMax);
		System.out.println(StudentMax.get(StudentMax.size()-1));
		bookpages.clear();
	}

}
