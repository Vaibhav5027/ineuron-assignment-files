package in.ineuron.impl;


public class BinerySearch {

	public int binarySearch(int[] arr, int target,int high ,int low) {
		
		
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(target==arr[mid])
				return mid;
			
			else if(target>=arr[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return -1;
	}
}
