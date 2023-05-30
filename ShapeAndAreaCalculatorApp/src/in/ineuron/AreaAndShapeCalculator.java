package in.ineuron;

public class AreaAndShapeCalculator {

	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle();
//		Triangle triangle = new Triangle();
		Circle circle = new Circle();

		areaCalculator(circle);

	}

	public static void areaCalculator(Shape shape) {
		System.out.println("Area ::" + shape.calculateArea());
		System.out.println("Perimeter::" + shape.calculatePerimeter());

	}
}
