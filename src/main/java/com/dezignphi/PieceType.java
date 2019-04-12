package com.dezignphi;

public enum PieceType
{
	YELLOW(1), BLUE(-1);

	final int moveDir;

	PieceType(int moveDir)
	{
		this.moveDir = moveDir;
	}
}
