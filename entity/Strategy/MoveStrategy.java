package com.Exercise3.entity.Strategy;

import com.Exercise3.entity.Piece.ChessPiece;

import java.util.Set;

public interface MoveStrategy {
    boolean move(int x, int y, Set<ChessPiece> chessPieces);
}
