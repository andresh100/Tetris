/*
 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import javafx.scene.paint.Color;

/**
 * This should be implemented to include your game control.
 * 
 * @author Andre Hansen
 */
public class TetrisGame {
	public static int score = 0;
	private boolean stop = false;
	private Shapes shapes;
	private final Tetris tetrisApp;
	private TetrisBoard tb;
	private int xdim = TetrisBoard.X_DIM_SQUARES;
	private int ydim = TetrisBoard.Y_DIM_SQUARES;
	private TetrisSquare[][] squares = new TetrisSquare[TetrisBoard.Y_DIM_SQUARES][TetrisBoard.X_DIM_SQUARES];
	public int[][] squaresInt = new int[TetrisBoard.X_DIM_SQUARES][TetrisBoard.Y_DIM_SQUARES];

	/**
	 * Initialize the game. Remove the example code and replace with code that
	 * creates a random piece.
	 * 
	 * @param tetrisApp
	 *            A reference to the application (use to set messages).
	 * @param board
	 *            A reference to the board on which Squares are drawn
	 */
	public TetrisGame(Tetris tetrisApp, TetrisBoard board) {

		// Some sample code that places two squares on the board.
		// Take this out and construct your random piece here.
		this.tb = board;
		shapes = new Shapes(board);
		this.tetrisApp = tetrisApp;
		tetrisApp.setMessage("Game has started! - Score:" + score);

	}

	/**
	 * Animate the game, by moving the current tetris piece down.
	 */
	void update() {
		if (end() == true) {
			tetrisApp.setMessage("Game Over! - You Scored:" + score);
			return;
		} else {
			shapes.moveDown();
			remove();
			/**
			 * Adds all x and y coordinates to an int array and a point 2d
			 * array.
			 */
			if (shapes.getAddSquare() == true || squares[Shapes.getSquare1().getY()][Shapes.getSquare1().getX()] != null
					|| squares[Shapes.getSquare2().getY()][Shapes.getSquare2().getX()] != null
					|| squares[Shapes.getSquare3().getY()][Shapes.getSquare3().getX()] != null
					|| squares[Shapes.getSquare4().getY()][Shapes.getSquare4().getX()] != null) {
				squares[Shapes.getSquare1().getY() - 1][Shapes.getSquare1().getX()] = Shapes.getSquare1();
				squares[Shapes.getSquare2().getY() - 1][Shapes.getSquare2().getX()] = Shapes.getSquare2();
				squares[Shapes.getSquare3().getY() - 1][Shapes.getSquare3().getX()] = Shapes.getSquare3();
				squares[Shapes.getSquare4().getY() - 1][Shapes.getSquare4().getX()] = Shapes.getSquare4();
				squaresInt[Shapes.getSquare1().getX()][Shapes.getSquare1().getY() - 1] = 1;
				squaresInt[Shapes.getSquare2().getX()][Shapes.getSquare2().getY() - 1] = 1;
				squaresInt[Shapes.getSquare3().getX()][Shapes.getSquare3().getY() - 1] = 1;
				squaresInt[Shapes.getSquare4().getX()][Shapes.getSquare4().getY() - 1] = 1;
				Shapes.getSquare1().setColor(Color.LIGHTGREY);
				Shapes.getSquare2().setColor(Color.GREY);
				Shapes.getSquare3().setColor(Color.GREY);
				Shapes.getSquare4().setColor(Color.GREY);
				stop = true;
				shapes = new Shapes(tb);
			} else {
				stop = false;
			}

		}

	}

	/*
	 * Method to check if blocks are to high up
	 */
	private boolean end() {
		for (int i = 5; i <= 6; i++) {
			for (int j = 0; j < (TetrisBoard.X_DIM_SQUARES); j++) {
				if (squaresInt[j][i] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Method to Remove Row
	 */
	private void remove() {
		int r = 0;
		Boolean filled = false;
		for (int i = 0; i < ydim; i++) {
			filled = true;
			for (int j = 0; j < (xdim); j++) {
				if (squaresInt[j][i] == 0) {
					filled = false;
					break;
				}
			}
			if (filled == true) {
				r = i;
				break;
			}
		}
		if (filled == true) {
			for (int k = 0; k < (xdim); k++) {
				squares[r][k].removeFromDrawing();
				score = score + 1;
				tetrisApp.setMessage("Game has started! - Score:" + score);
			}
			/*
			 * Move Row Down by 1
			 */
			for (int i = r; i >= 1; i--) {
				for (int k = 0; k < (xdim); k++) {
					if (squaresInt[k][i - 1] == 1) {
						int x = squares[i - 1][k].getX();
						int y = squares[i - 1][k].getY();
						squares[i - 1][k].moveToTetrisLocation(x, y + 1);
					}
					squares[i][k] = squares[i - 1][k];
					squaresInt[k][i] = squaresInt[k][i - 1];
				}
			}
		}
	}

	/**
	 * Move the current tetris piece left.
	 */
	void left() {
		if (end() == true) {

		} else {
			shapes.moveLeft();
		}
	}

	/**
	 * Move the current tetris piece right.
	 */
	void right() {
		if (end() == true) {
		} else {
			shapes.moveRight();
		}
	}

	/**
	 * Drop the current tetris piece.
	 */
	void drop() {
		if (end() == true || stop == true) {
		} else {
			shapes.moveDown();
		}
	}

	/**
	 * Rotate the current piece counter-clockwise.
	 */
	void rotateLeft() {
		if (end() == true) {

		} else {
			shapes.rotateDown();
		}
	}

	/**
	 * Rotate the current piece clockwise.
	 */
	void rotateRight() {
		if (end() == true) {

		} else {
			shapes.rotateUp();
		}
	}

}
