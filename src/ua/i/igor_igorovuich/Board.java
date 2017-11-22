package ua.i.igor_igorovuich;

public class Board {
	private Shape[] board = new Shape[4]; 

	public Board() {
		super();
	}

	public void addFigure(Shape figure, int number) {
		if (number <= 4 && number - 1 >= 0 && board[number - 1] == null) {
			board[number - 1] = figure;
			System.out.println("Figure was added!");
		} else {
			System.out.println("Error!");
		}
	}

	public void deleteFigure(int number) {
		if (number <= 4 && number - 1 >= 0 && board[number - 1] != null) {
			board[number - 1] = null;
			System.out.println("Figure was deleted!");
		} else {
			System.out.println("Error! Can't remove figure "+number+" from board.");
		}
	}

	@Override
	public String toString() {
		double sumArea = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				sb.append((i+1) + ". " + board[i].toString() + "." + System.lineSeparator());
				sumArea = sumArea + board[i].calculateArea();
			} else {
				sb.append((i+1) + ". Empty cell." + System.lineSeparator());
			}
		}
		sb.append("sumArea = " + sumArea);
		String text = sb.toString();
		return text;
	}

}
