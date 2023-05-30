package in.ineuron.main;

import in.ineuron.impl.BinerySearch;

public class Test {

	public static void main(String[] args) {
		int [] arr =new int[] {15,25,40,55,68,79,98};
		int low=0;
		int high=arr.length-1;
		int target=68;
		BinerySearch search=new BinerySearch();
		
		int binarySearch = search.binarySearch(arr, target, high, low);
	   
	    if(binarySearch<0)
	    	System.out.println("target number not found");
	    else 
	    	System.out.println("target number found at index ::"+binarySearch);
	    
	}

}
