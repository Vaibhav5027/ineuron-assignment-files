package in.ineuron;

import java.util.Scanner;

public class Circle implements Shape
{
	
    private double pi=3.142;  
    Scanner sc=new Scanner(System.in);
	@Override
	public double calculateArea() {
		System.out.print("Enter the radious of circle:: ");
		double radius=sc.nextDouble();
		
		double areaOfCircle=pi*radius*radius;
		return areaOfCircle;
	}

	@Override
	public double calculatePerimeter() {
		System.out.print("Enter the radious of circle::");
		double radius=sc.nextDouble();
		double perimeterOfcircle=2*pi*radius;
		return perimeterOfcircle;
	}

}
