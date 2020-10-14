package org.academiadecodigo.bootcamp.Ball;
import org.academiadecodigo.bootcamp.game.GameLayout;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class BallFactory {

    private static Ball[] balls;

    private double speed;
    private int ballScore;

    private static final double chanceBallColor = 0.7;

    public Color randomColorBall(){

        BallColor color = BallColor.values()[(int)(Math.random() * BallColor.values().length)];

        return switch (color) {
            case GREEN -> Color.GREEN;
            case BLUE -> Color.BLUE;
            case RED -> Color.RED;
            case CYAN -> Color.CYAN;
            case MAGENTA -> Color.MAGENTA;
            case YELLOW -> Color.YELLOW;
        };



    }

    public void makeBall(){
        new Ball(randomColorBall() ,0, 350, 48, 48, 10, 10);
    }






}
