package com.dezignphi;

public class MoveResult
{
	private MoveType type;

	private Piece piece;

	public Piece getPiece()
	{
		return piece;
	}

	public MoveResult(MoveType type, Piece piece)
	{
		this.type = type;
		this.piece = piece;
	}

	public MoveResult(MoveType type)
	{
		this(type, null);
	}

	public MoveType getType()
	{
		return type;
	}


}
