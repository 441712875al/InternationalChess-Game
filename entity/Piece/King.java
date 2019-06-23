package com.Exercise3.entity.Piece;

import com.Exercise3.entity.PieceType;
import com.Exercise3.entity.Strategy.KingStrategy;

public class King extends ChessPiece {
    public King(PieceType type, int row, int col) {
        super(type, row, col);
        setMoveStrategy(new KingStrategy(getCol(),getRow()));
    }
}
