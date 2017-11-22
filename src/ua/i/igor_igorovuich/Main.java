package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {

		Circle circleOne = new Circle(new Point(-5, -5), new Point(0, 5));
		System.out.println(circleOne);
		System.out.println();
		Triangle triangleOne = new Triangle(new Point(0, 2), new Point(0, 0), new Point(2, 0));
		System.out.println(triangleOne);

	}

}
