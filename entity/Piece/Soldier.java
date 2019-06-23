package com.Exercise3.entity.Piece;

import com.Exercise3.entity.PieceType;
import com.Exercise3.entity.Strategy.SoldierStategy;

public class Soldier extends ChessPiece{
    public Soldier(PieceType type, int row, int col) {
        super(type, row, col);
        setMoveStrategy(new SoldierStategy(getCol(),getRow(),getSide()));
    }

}
