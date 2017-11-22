package ua.i.igor_igorovuich;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double calculatePerimetr() {
		if ((a.getLength(b) > b.getLength(c) + c.getLength(a)) || (b.getLength(c) > a.getLength(b) + c.getLength(a))
				|| (c.getLength(a) > a.getLength(b) + b.getLength(c))) {
			return 0.0;
		} else {
			return a.getLength(b) + b.getLength(c) + c.getLength(a);
		}
	}

	@Override
	double calculateArea() {
		if ((a.getLength(b) > b.getLength(c) + c.getLength(a)) || (b.getLength(c) > a.getLength(b) + c.getLength(a))
				|| (c.getLength(a) > a.getLength(b) + b.getLength(c))) {
			return 0.0;
		} else {
			double polP = (a.getLength(b) + b.getLength(c) + c.getLength(a)) / 2;
			return Math.sqrt(polP * (polP - a.getLength(b)) * (polP - b.getLength(c)) * (polP - c.getLength(a)));
		}
	}

	@Override
	public String toString() {
		return "Triangle [Perimetr = " + calculatePerimetr() + ", Area = " + calculateArea() + "]";
	}

}
