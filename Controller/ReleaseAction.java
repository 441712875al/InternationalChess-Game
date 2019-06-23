package com.Exercise3.Controller;

import com.Exercise3.entity.Piece.ChessPiece;
import com.Exercise3.entity.PieceType;
import com.Exercise3.view.ChessBoard;
import com.Exercise3.view.ChessPane;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

import java.util.Stack;

public class ReleaseAction implements EventHandler<MouseEvent> {
    private ChessPane chessPane;
    static Stack<ChessPiece> stack = new Stack<>();

    public ReleaseAction(ChessPane chessPane) {
        this.chessPane = chessPane;
    }

    @Override
    public void handle(MouseEvent e) {
        chessPane.drawBoard();
        ChessBoard chessBoard = chessPane.getChessBoard();
        int x = (int) ((e.getX() - chessBoard.getStartX()) / (chessBoard.getCellLength()));
        int y = (int) ((e.getY() - chessBoard.getStartY()) / (chessBoard.getCellLength()));

        for (ChessPiece o : chessPane.getChessPieces()) {
            if (o.isSelected()) {

                System.out.println(o.isSelected()+" "+o.getRow()+" "+o.getCol());
                if (chessBoard.getCurrSide()==o.getSide()){
                    if(o.getMoveStrategy().move(x, y,chessPane.getChessPieces())){
                        if(judgeGame(x,y)){
                            printTip(o.getSide());
                        }
                        eatPiece(x,y);
                        stack.push((ChessPiece) o.clone());
                        o.setCol(x);
                        o.setRow(y);

                        chessBoard.changeSide();
                    }

                }
                o.setSelected(false);
                break;
            }

        }

        chessPane.drawPiece();
    }

    public void  eatPiece(int x,int y){
        chessPane.getChessPieces().removeIf(e->{
            if(e.getCol()==x&&e.getRow()==y){
                stack.push(e);
                return true;
            }
            return false;
        });
    }

    public boolean judgeGame(int x,int y){
        for(ChessPiece e:chessPane.getChessPieces()){
            if(e.getCol()==x&&e.getRow()==y&&(
                    e.getType()== PieceType.KINGBLACK||e.getType()==PieceType.KINGWHITE))
                return true;
        }

        return false;
    }

    public void printTip(char side){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText((side=='B'?"黑":"白")+"方取得胜利");
        alert.setTitle("游戏结束");
        alert.showAndWait();
    }


}
