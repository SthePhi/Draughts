package com.dezignphi;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

import static com.dezignphi.DraughtsApp.TILE_SIZE;

/*
 *@Autor Sthembiso Maseko
 */

public class Piece extends StackPane
{
	private PieceType type;
	private double mouseX, mouseY;
	private double oldX, oldY;

	public PieceType getType()
	{
		return type;
	}

	public double getOldY()
	{
		return oldY;
	}

	public double getOldX()
        {
                return oldX;
        }


	public Piece(PieceType type, int x, int y)
	{
		this.type = type;

		move(x, y);

		Ellipse ellipse = new Ellipse(TILE_SIZE * .3125, TILE_SIZE  * 0.26);
		ellipse.setFill(Color.BLACK);
		ellipse.setStroke(Color.BLACK);
		ellipse.setStrokeWidth(TILE_SIZE * 0.03);

		ellipse.setTranslateX((TILE_SIZE - TILE_SIZE * 0.3125 * 2)/ 2);
		ellipse.setTranslateY((TILE_SIZE - TILE_SIZE * 0.26 * 2)/ 2 + TILE_SIZE * 0.07);

		Ellipse ellipse2 = new Ellipse(TILE_SIZE * .3125, TILE_SIZE  * 0.26);
		ellipse2.setFill(type == PieceType.YELLOW ? Color.valueOf("#FFFF00"): Color.valueOf("#00FFFF"));
                ellipse2.setStroke(Color.BLACK);
                ellipse2.setStrokeWidth(TILE_SIZE * 0.03);

                ellipse2.setTranslateX((TILE_SIZE - TILE_SIZE * 0.3125 * 2)/ 2);
                ellipse2.setTranslateY((TILE_SIZE - TILE_SIZE * 0.26 * 2)/ 2);

		getChildren().addAll(ellipse, ellipse2);

		setOnMousePressed(e -> 
		{
			mouseX = e.getSceneX();
			mouseY = e.getSceneY();
		});

		setOnMouseDragged(e ->
		{
			relocate(e.getSceneX() - mouseX + oldX, e.getSceneY() - mouseY + oldY);		
		});
	}
	public void move(int x, int y)
	{
		oldX = x * TILE_SIZE;
		oldY = y * TILE_SIZE;
		relocate(oldX, oldY);
	}

	public void abortMove()
	{
		relocate(oldX, oldY);
	}
}
