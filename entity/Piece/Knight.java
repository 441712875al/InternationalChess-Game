package com.Exercise3.entity.Piece;

import com.Exercise3.entity.PieceType;
import com.Exercise3.entity.Strategy.KnightStrategy;

public class Knight extends ChessPiece {
    public Knight(PieceType type, int row, int col) {
        super(type, row, col);
        setMoveStrategy(new KnightStrategy(getCol(),getRow()));
    }
}
