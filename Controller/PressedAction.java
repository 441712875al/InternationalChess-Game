package com.Exercise3.Controller;

import com.Exercise3.view.ChessBoard;
import com.Exercise3.view.ChessPane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;


public class PressedAction implements EventHandler<MouseEvent> {
    private ChessPane chessPane;
    private MediaPlayer mediaPlayer;


    public PressedAction(ChessPane chessPane,MediaPlayer mediaPlayer) {
        this.chessPane = chessPane;
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void handle(MouseEvent e) {
        ChessBoard chessBoard = chessPane.getChessBoard();
        int x=(int)((e.getX()-chessBoard.getStartX())/(chessBoard.getCellLength()));
        int y=(int)((e.getY()-chessBoard.getStartY())/(chessBoard.getCellLength()));


        chessPane.getChessPieces().forEach(o->{
            if(o.getCol()==x&&o.getRow()==y){
                o.setSelected(true);
                chessPane.drawPiece();
            }
        });
        mediaPlayer.play();
    }

}
