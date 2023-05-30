package in.ineuron;

import java.util.Scanner;

public class Triangle implements Shape {
 Scanner sc= new Scanner(System.in);
	
	@Override
	public double calculateArea() {
		
		System.out.println("Enter height of triangle:: ");
		double height=sc.nextDouble();
		System.out.println("Enter base of triangle:: ");
		double base=sc.nextDouble();
		
		double areaOfTrianle=0.5 *height * base;
		return areaOfTrianle;
	}

	@Override
	public double calculatePerimeter() {
		System.out.println("Enter 3 sides of triangle");
	double firstSide=sc.nextDouble();
	double secondSide=sc.nextDouble();
	double thirdSide=sc.nextDouble();
	double perimeterOfTriangle=firstSide+secondSide+thirdSide;
		return perimeterOfTriangle;
	}

}
