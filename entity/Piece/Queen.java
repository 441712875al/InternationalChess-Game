package com.Exercise3.entity.Piece;

import com.Exercise3.entity.PieceType;
import com.Exercise3.entity.Strategy.QueenStrategy;

public class Queen extends ChessPiece {
    public Queen(PieceType type, int row, int col) {
        super(type, row, col);
        setMoveStrategy(new QueenStrategy(getCol(),getRow()));
    }
}
