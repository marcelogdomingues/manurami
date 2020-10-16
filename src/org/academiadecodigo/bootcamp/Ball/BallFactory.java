package org.academiadecodigo.bootcamp.Ball;
import org.academiadecodigo.bootcamp.game.GameLayout;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class BallFactory {

    private Ball[] balls;
    private int ballNumber;
    private double speed;
    private int ballScore;
    private int ballCounter;
    private static final double chanceBallColor = 0.7;


    public BallFactory(double speed, int ballScore,int ballNumber){
        balls = new Ball[ballNumber];
        this.ballScore = ballScore;
        this.speed = speed;
        this.ballNumber = ballNumber;
    }

    public Color randomColorBall(){

        ///Ver o que e que se passa com o BallColor.values().length
        BallColor color = BallColor.values()[(int) Math.random() * 6];

        return switch (color) {
            case GREEN -> Color.GREEN;
            case BLUE -> Color.BLUE;
            case RED -> Color.RED;
            case CYAN -> Color.CYAN;
            case MAGENTA -> Color.MAGENTA;
            case YELLOW -> Color.YELLOW;
        };

    }

    public Ball[] getBalls() {
        return balls;
    }

    public void makeBall(){
        balls[ballCounter] = new Ball(randomColorBall() ,0, 350, 48, 48, speed, ballScore);
        if(ballCounter < ballNumber - 1){
            ballCounter++;
        }else{
            ballCounter = 0;
        }



    }






}
