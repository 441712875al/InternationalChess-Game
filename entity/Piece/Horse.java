package com.Exercise3.entity.Piece;

import com.Exercise3.entity.PieceType;
import com.Exercise3.entity.Strategy.HorseStategy;

public class Horse extends ChessPiece{
    public Horse(PieceType type, int row, int col) {
        super(type, row, col);
        setMoveStrategy(new HorseStategy(getCol(),getRow()));
    }
}
