package com.Exercise3.entity;

public enum PieceType {
    KINGBLACK("KingBlack","com/Exercise3/img/KingBlack.jpg"),
    QUEENBLACK("QueenBlack","com/Exercise3/img/QueenBlack.jpg"),
    CARBLACK("CarBlack","com/Exercise3/img/CarBlack.jpg"),
    HORSEBLACK("HorseBlack","com/Exercise3/img/HorseBlack.jpg"),
    SOLDIERBLACK("SoldierBlack","com/Exercise3/img/SoldierBlack.jpg"),
    KNIGHTBLACK("KnightBlack","com/Exercise3/img/KnightBlack.jpg"),

    KINGWHITE("KingWhite","com/Exercise3/img/KingWhite.jpg"),
    QUEENWHITE("QueenWhite","com/Exercise3/img/QueenWhite.jpg"),
    CARWHITE("CarWhite","com/Exercise3/img/CarWhite.jpg"),
    HORSEWHITE("HorseWhite","com/Exercise3/img/HorseWhite.jpg"),
    SOLDIERWHITE("SoldierWhite","com/Exercise3/img/SoldierWhite.jpg"),
    KNIGHTWHITE("KnightWhite","com/Exercise3/img/KnightWhite.jpg");


    private String desc;
    private PieceType(String desc,String url ){
        this.desc = desc;
        this.url = url;
    }

    private String url;

    public String getDesc(){
        return desc;
    }

    public String getUrl() {
        return url;
    }
}
