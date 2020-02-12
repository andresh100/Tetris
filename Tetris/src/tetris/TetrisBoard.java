/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * A Pane in which tetris squares can be displayed.
 * 
 * @author Andre Hansen
 */
public class TetrisBoard extends Pane {
	// The size of the side of a tetris square
	public static final int SQUARE_SIZE = 20;
	// The number of squares that fit on the screen in the x and y dimensions
	public static final int X_DIM_SQUARES = 20;
	public static final int Y_DIM_SQUARES = 30;

	/**
	 * Sizes the board to hold the specified number of squares in the x and y
	 * dimensions.
	 */
	public TetrisBoard() {
		this.setPrefHeight(Y_DIM_SQUARES * SQUARE_SIZE);
		this.setPrefWidth(X_DIM_SQUARES * SQUARE_SIZE);
		// BLUEVIOLET
		BackgroundFill myBF = new BackgroundFill(Color.BLACK, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
																													// null
																													// for
																													// the
																													// padding
		setBackground(new Background(myBF));

	}

}
