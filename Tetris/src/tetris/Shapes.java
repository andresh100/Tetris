package tetris;

import java.util.Random;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Shapes {

	/*
	 * Initializing variables
	 */
	private TetrisBoard tb;
	private Random random = new Random();
	private int randInt = random.nextInt(7);
	private Point2D relatLoc;
	private Point2D relatLoc1;
	private Point2D relatLoc2;
	private Point2D relatLoc3;
	private Point2D newRelatLoc1;
	private Point2D newRelatLoc2;
	private Point2D newRelatLoc3;
	private static TetrisSquare square1;
	private static TetrisSquare square2;
	private static TetrisSquare square3;
	private static TetrisSquare square4;
	private boolean addSquare = false;

	/*
	 * If statements in order to choose a random shape method
	 */
	void randomShape(TetrisBoard TetrisBoard) {

		if (randInt == 0) {
			square(tb);
		} else if (randInt == 1) {
			one(tb);
		} else if (randInt == 2) {
			rr(tb);
		} else if (randInt == 3) {
			zz(tb);
		} else if (randInt == 4) {
			ss(tb);
		} else if (randInt == 5) {
			ii(tb);
		} else {
			tt(tb);
		}
	}

	public static TetrisSquare getSquare1() {
		return square1;
	}

	public static TetrisSquare getSquare2() {
		return square2;
	}

	public static TetrisSquare getSquare3() {
		return square3;
	}

	public static TetrisSquare getSquare4() {
		return square4;
	}

	int i = 1;

	/*
	 * Individual Methods that are called by the random method. Inside each
	 * method the shape has their own individual relative Locations.
	 */
	public void square(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = 0;
		int y1 = -1;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = -1;
		int y2 = -1;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = -1;
		int y3 = 0;
		relatLoc3 = new Point2D(x3, y3);
	}

	public void one(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = 0;
		int y1 = -1;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = -1;
		int y2 = -1;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = 0;
		int y3 = 1;
		relatLoc3 = new Point2D(x3, y3);
	}

	public void rr(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = 0;
		int y1 = -1;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = 1;
		int y2 = -1;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = 0;
		int y3 = 1;
		relatLoc3 = new Point2D(x3, y3);
	}

	public void zz(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = 0;
		int y1 = -1;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = -1;
		int y2 = -1;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = 1;
		int y3 = 0;
		relatLoc3 = new Point2D(x3, y3);
	}

	public void ss(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = 0;
		int y1 = -1;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = 1;
		int y2 = -1;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = -1;
		int y3 = 0;
		relatLoc3 = new Point2D(x3, y3);
	}

	public void ii(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = 0;
		int y1 = -1;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = 0;
		int y2 = 2;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = 0;
		int y3 = 1;
		relatLoc3 = new Point2D(x3, y3);
	}

	public void tt(TetrisBoard tb) {
		relatLoc = new Point2D(0, 0);
		int x1 = -1;
		int y1 = 0;
		relatLoc1 = new Point2D(x1, y1);
		int x2 = 1;
		int y2 = 0;
		relatLoc2 = new Point2D(x2, y2);
		int x3 = 0;
		int y3 = 1;
		relatLoc3 = new Point2D(x3, y3);
	}

	/*
	 * Getter and setter methods for the relative locations of the shapes
	 */
	public boolean getAddSquare() {
		return addSquare;
	}

	public Point2D getRelatLoc1() {
		return relatLoc1;
	}

	public void setRelatLoc1(Point2D relatLoc1) {
		this.relatLoc1 = relatLoc1;
	}

	public Point2D getRelatLoc2() {
		return relatLoc2;
	}

	public void setRelatLoc2(Point2D relatLoc2) {
		this.relatLoc2 = relatLoc2;
	}

	public Point2D getRelatLoc3() {
		return relatLoc3;
	}

	public void setRelatLoc3(Point2D relatLoc3) {
		this.relatLoc3 = relatLoc3;
	}

	/*
	 * Shapes constructor
	 */
	public Shapes(TetrisBoard gBoard) {
		newShape(gBoard);

	}

	/*
	 * Move Left method
	 */
	public void moveLeft() {
		if (square1.getX() == 0 || square2.getX() == 0 || square3.getX() == 0 || square4.getX() == 0) {

		} else if (square1.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square2.getY() + 1 == TetrisBoard.Y_DIM_SQUARES
				|| square3.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square4.getY() + 1 == TetrisBoard.Y_DIM_SQUARES) {
		} else {
			square1.moveToTetrisLocation(square1.getX() - 1, square1.getY());
			square2.moveToTetrisLocation(square2.getX() - 1, square2.getY());
			square3.moveToTetrisLocation(square3.getX() - 1, square3.getY());
			square4.moveToTetrisLocation(square4.getX() - 1, square4.getY());
		}
	}

	/*
	 * move right method
	 */
	public void moveRight() {
		if (square1.getX() + 1 == TetrisBoard.X_DIM_SQUARES || square2.getX() + 1 == TetrisBoard.X_DIM_SQUARES
				|| square3.getX() + 1 == TetrisBoard.X_DIM_SQUARES || square4.getX() + 1 == TetrisBoard.X_DIM_SQUARES) {

		} else if (square1.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square2.getY() + 1 == TetrisBoard.Y_DIM_SQUARES
				|| square3.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square4.getY() + 1 == TetrisBoard.Y_DIM_SQUARES) {
		} else {
			square1.moveToTetrisLocation(square1.getX() + 1, square1.getY());
			square2.moveToTetrisLocation(square2.getX() + 1, square2.getY());
			square3.moveToTetrisLocation(square3.getX() + 1, square3.getY());
			square4.moveToTetrisLocation(square4.getX() + 1, square4.getY());
		}
	}

	/*
	 * move down method
	 */
	public void moveDown() {
		if (square1.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square2.getY() + 1 == TetrisBoard.Y_DIM_SQUARES
				|| square3.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square4.getY() + 1 == TetrisBoard.Y_DIM_SQUARES) {
			square1.setColor(Color.LIGHTGREY);
			square2.setColor(Color.GREY);
			square3.setColor(Color.GREY);
			square4.setColor(Color.GREY);
			addSquare = true;
			// squares[square1.getY()][square1.getX()] == square1

		} else {
			square1.moveToTetrisLocation(square1.getX(), square1.getY() + 1);
			square2.moveToTetrisLocation(square2.getX(), square2.getY() + 1);
			square3.moveToTetrisLocation(square3.getX(), square3.getY() + 1);
			square4.moveToTetrisLocation(square4.getX(), square4.getY() + 1);
		}
	}

	/*
	 * rotate up rotates right
	 */
	public void rotateUp() {
		// System.out.println("1"+relatLoc1.getX()+relatLoc1.getY());
		// System.out.println("2"+relatLoc2.getX()+relatLoc2.getY());
		// System.out.println("3"+relatLoc3.getX()+relatLoc3.getY());

		newRelatLoc1 = new Point2D(-relatLoc1.getY(), relatLoc1.getX());
		newRelatLoc2 = new Point2D(-relatLoc2.getY(), relatLoc2.getX());
		newRelatLoc3 = new Point2D(-relatLoc3.getY(), relatLoc3.getX());

		if ((square1.getX() + newRelatLoc1.getX() < 0)
				|| (square1.getX() + 1 + newRelatLoc1.getX()) > TetrisBoard.X_DIM_SQUARES
				|| (square1.getY() + 1 + newRelatLoc1.getY()) == TetrisBoard.Y_DIM_SQUARES) {

		} else if ((square1.getX() + newRelatLoc2.getX()) < 0
				|| (square1.getX() + 1 + newRelatLoc2.getX()) > TetrisBoard.X_DIM_SQUARES
				|| (square1.getY() + 1 + newRelatLoc2.getY()) == TetrisBoard.Y_DIM_SQUARES) {
		} else if ((square1.getX() + newRelatLoc3.getX()) < 0
				|| (square1.getX() + 1 + newRelatLoc3.getX()) > TetrisBoard.X_DIM_SQUARES
				|| (square1.getY() + 1 + newRelatLoc3.getY()) == TetrisBoard.Y_DIM_SQUARES) {
		} else if (square1.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square2.getY() + 1 == TetrisBoard.Y_DIM_SQUARES
				|| square3.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square4.getY() + 1 == TetrisBoard.Y_DIM_SQUARES) {
		} else {
			setRelatLoc1(newRelatLoc1);
			setRelatLoc2(newRelatLoc2);
			setRelatLoc3(newRelatLoc3);

			/*
			 * int casting because TA told me too, since relative locations were
			 * point2D
			 */
			square2.moveToTetrisLocation((int) (square1.getX() + relatLoc1.getX()),
					(int) (square1.getY() + relatLoc1.getY()));
			square3.moveToTetrisLocation((int) (square1.getX() + relatLoc2.getX()),
					(int) (square1.getY() + relatLoc2.getY()));
			square4.moveToTetrisLocation((int) (square1.getX() + relatLoc3.getX()),
					(int) (square1.getY() + relatLoc3.getY()));
		}

	}

	/*
	 * rotate down rotates left
	 */
	public void rotateDown() {
		// System.out.println("1"+relatLoc1.getX()+relatLoc1.getY());
		// System.out.println("2"+relatLoc2.getX()+relatLoc2.getY());
		// System.out.println("3"+relatLoc3.getX()+relatLoc3.getY());

		newRelatLoc1 = new Point2D(relatLoc1.getY(), -relatLoc1.getX());
		newRelatLoc2 = new Point2D(relatLoc2.getY(), -relatLoc2.getX());
		newRelatLoc3 = new Point2D(relatLoc3.getY(), -relatLoc3.getX());

		if ((square1.getX() + newRelatLoc1.getX() < 0)
				|| (square1.getX() + 1 + newRelatLoc1.getX()) > TetrisBoard.X_DIM_SQUARES
				|| (square1.getY() + 1 + newRelatLoc1.getY()) == TetrisBoard.Y_DIM_SQUARES) {

		} else if ((square1.getX() + newRelatLoc2.getX()) < 0
				|| (square1.getX() + 1 + newRelatLoc2.getX()) > TetrisBoard.X_DIM_SQUARES
				|| (square1.getY() + 1 + newRelatLoc2.getY()) == TetrisBoard.Y_DIM_SQUARES) {
		} else if ((square1.getX() + newRelatLoc3.getX()) < 0
				|| (square1.getX() + 1 + newRelatLoc3.getX()) > TetrisBoard.X_DIM_SQUARES
				|| (square1.getY() + 1 + newRelatLoc3.getY()) == TetrisBoard.Y_DIM_SQUARES) {
		} else if (square1.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square2.getY() + 1 == TetrisBoard.Y_DIM_SQUARES
				|| square3.getY() + 1 == TetrisBoard.Y_DIM_SQUARES || square4.getY() + 1 == TetrisBoard.Y_DIM_SQUARES) {
		} else {
			setRelatLoc1(newRelatLoc1);
			setRelatLoc2(newRelatLoc2);
			setRelatLoc3(newRelatLoc3);
			/*
			 * int casting because TA told me too, since relative locations were
			 * point2D
			 */
			square2.moveToTetrisLocation((int) (square1.getX() + relatLoc1.getX()),
					(int) (square1.getY() + relatLoc1.getY()));
			square3.moveToTetrisLocation((int) (square1.getX() + relatLoc2.getX()),
					(int) (square1.getY() + relatLoc2.getY()));
			square4.moveToTetrisLocation((int) (square1.getX() + relatLoc3.getX()),
					(int) (square1.getY() + relatLoc3.getY()));
		}

	}

	public void newShape(TetrisBoard gBoard) {
		randomShape(tb);
		System.out.println(randInt);
		square1 = new TetrisSquare(gBoard);
		square1.moveToTetrisLocation(TetrisBoard.X_DIM_SQUARES / 2, 3);
		square1.setColor(Color.WHITE);
		/*
		 * int casting because TA told me too, since relative locations were
		 * point2D
		 */
		square2 = new TetrisSquare(gBoard);
		square2.moveToTetrisLocation((int) (square1.getX() + relatLoc1.getX()),
				(int) (square1.getY() + relatLoc1.getY()));
		// square2.setColor(Color.BLACK);

		square3 = new TetrisSquare(gBoard);
		square3.moveToTetrisLocation((int) (square1.getX() + relatLoc2.getX()),
				(int) (square1.getY() + relatLoc2.getY()));
		// square3.setColor(Color.BLACK);

		square4 = new TetrisSquare(gBoard);
		square4.moveToTetrisLocation((int) (square1.getX() + relatLoc3.getX()),
				(int) (square1.getY() + relatLoc3.getY()));
		// square4.setColor(Color.BLACK);
		/*
		 * If statements based on the random shape that is called in order to
		 * change their colors.
		 */
		if (randInt == 0) {
			square2.setColor(Color.RED);
			square3.setColor(Color.RED);
			square4.setColor(Color.RED);
		}
		if (randInt == 1) {
			square2.setColor(Color.ORANGE);
			square3.setColor(Color.ORANGE);
			square4.setColor(Color.ORANGE);
		}
		if (randInt == 2) {
			square2.setColor(Color.LIGHTBLUE);
			square3.setColor(Color.LIGHTBLUE);
			square4.setColor(Color.LIGHTBLUE);
		}
		if (randInt == 3) {
			square2.setColor(Color.GREEN);
			square3.setColor(Color.GREEN);
			square4.setColor(Color.GREEN);
		}
		if (randInt == 4) {
			square2.setColor(Color.BLUEVIOLET);
			square3.setColor(Color.BLUEVIOLET);
			square4.setColor(Color.BLUEVIOLET);
		}
		if (randInt == 5) {
			square2.setColor(Color.BLUE);
			square3.setColor(Color.BLUE);
			square4.setColor(Color.BLUE);
		}
		if (randInt == 6) {
			square2.setColor(Color.YELLOW);
			square3.setColor(Color.YELLOW);
			square4.setColor(Color.YELLOW);
		}
	}

}
