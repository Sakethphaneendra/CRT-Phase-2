package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,4,6,23,75,23,64,13,45,23,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
//					Swap
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
