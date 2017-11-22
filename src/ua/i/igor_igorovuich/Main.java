package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {

		Circle circleOne = new Circle(new Point(0, 0), new Point(0, 1));
		System.out.println(circleOne);
		System.out.println();
		Triangle triangleOne = new Triangle(new Point(0, 2), new Point(0, 0), new Point(2, 0));
		System.out.println(triangleOne);

		System.out.println();
		
		Board board = new Board();
		
		board.addFigure(circleOne, 1);
		board.addFigure(triangleOne, 3);
		board.addFigure(circleOne, 4);
				
		System.out.println(board);
		System.out.println();

		board.deleteFigure(3);
		board.deleteFigure(2);
		
		System.out.println("New board!");
		System.out.println(board);
	}

}
