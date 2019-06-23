package com.Exercise3.entity.Piece;

import com.Exercise3.entity.PieceType;
import com.Exercise3.entity.Strategy.CarStrategy;

public class Car extends ChessPiece {
    public Car(PieceType type, int row, int col) {
        super(type, row, col);
        setMoveStrategy(new CarStrategy(getCol(),getRow()));
    }
}
