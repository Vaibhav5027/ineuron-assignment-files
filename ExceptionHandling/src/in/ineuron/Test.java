package in.ineuron;

import java.util.Scanner;
import in.ineuron.exception.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Usert Enter The Number :: ");
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println("User Entered Number Is :: "+ number);
		}
		else
			throw new NegativeNumberException();
	}

}
