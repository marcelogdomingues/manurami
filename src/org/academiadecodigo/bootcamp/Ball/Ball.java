package org.academiadecodigo.bootcamp.Ball;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Ball {

    private Ellipse ball;
    private double speed;
    private int ballScore;

    public Ball(Color color, double x, double y, double width, double height, double speed, int ballScore) {
        this.ballScore = ballScore;
        this.speed = speed;
        ball = new Ellipse( x, y, width, height);
        ball.setColor(color);
        ball.fill();

    }

    public void moveBall(){
        ball.translate(10 ,0);

    }

    public void newBallMovement(){
        ball.translate(85 ,0);

    }

    public Ellipse getBall() {
        return ball;
    }


}
