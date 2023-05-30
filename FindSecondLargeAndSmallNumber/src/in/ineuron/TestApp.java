package in.ineuron;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter Size of List");
		int number = sc.nextInt();
		int count = number;
//		list created 
//		list size must be greater than 2
		
		if( count<=2) {
			System.out.println("list size must be greather than 2");
		}
		else {
		while(list.size()!=count  ) {
			System.out.println("Enter the number to add in list DO NOT ENTER DUPLICATE VALUE");
			Integer num = sc.nextInt();
			if (list.contains(num)) {
				System.out.println("Number Already Present");
			} else {
				list.add(num);
			}

		}
		
//to find second small and largest number we need to sort the list 
//1. first way to sort the list 
		Collections.sort(list);
		System.out.println(list);
		
//2. second way to sort the list
		for(int i=0;i<list.size();i++) {
			
			for(int j=0;j<list.size();j++) {
				if(list.get(i)<list.get(j)) {
					int temp=list.get(i);
					int temp2=list.get(j);
					list.set(i, temp2);
					list.set(j, temp);
					}
				
			}
		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
 
	System.out.println("The Second Largest number is ::"+list.get(count-2));
	System.out.println("The Second Smallest number is ::"+list.get(1));
	}
	}
}
