package com.Exercise3;

import com.Exercise3.Controller.PressedAction;
import com.Exercise3.Controller.ReleaseAction;
import com.Exercise3.Controller.ResetAction;
import com.Exercise3.view.ChessBoard;
import com.Exercise3.view.ChessPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        String MEDIA_URL = "file:/E:/IdeaProjects/Experiment/src/com/Exercise3/music/BackgroundMusic.mp3";
        ChessBoard chessBoard = ChessBoard.getInstance(100,40,40);

        //添加媒体资源

        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();



        ChessPane pane = new ChessPane(chessBoard);
        pane.setOnMousePressed(new PressedAction(pane,mediaPlayer));

        pane.setOnMouseReleased(new ReleaseAction(pane));

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.TOP_CENTER);

        Button button = new Button("悔棋");
        button.setOnAction(new ResetAction(pane));

        hBox.getChildren().add(button);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane,900,900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("国际象棋");
        primaryStage.show();

    }
}
