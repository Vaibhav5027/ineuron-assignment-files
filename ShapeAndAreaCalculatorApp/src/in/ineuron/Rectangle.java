package in.ineuron;

import java.util.Scanner;

public class Rectangle implements Shape {
    Scanner sc=new Scanner(System.in);
	@Override
	public double calculateArea() {
		System.out.println("Enter the lenth of rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter the width of rectangle");
		double width=sc.nextDouble();
		
		double area=width * length;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		System.out.println("Enter the lenth of rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter the width of rectangle");
		double width=sc.nextDouble();
		double perimeter= 2*(length+width);
		return perimeter;
	}

}
