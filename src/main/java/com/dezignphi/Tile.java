package com.dezignphi;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

/*
 *@Author Sthembiso Maseko
 */

public class Tile extends Rectangle
{
	private Piece piece;

	public boolean hasPiece()
	{
		return piece!= null;
	}

	public Piece getPiece()
	{
		return piece;
	}

	public void setPiece(Piece piece)
	{
		this.piece = piece;
	}

	public Tile(boolean light, int x, int y)
	{
		setWidth(DraughtsApp.TILE_SIZE);
		setHeight(DraughtsApp.TILE_SIZE);

		relocate(x * DraughtsApp.TILE_SIZE, y * DraughtsApp.TILE_SIZE);
		setFill(light ? Color.valueOf("#D3D3D3"): Color.valueOf("#2F4F4F"));
	}
}
