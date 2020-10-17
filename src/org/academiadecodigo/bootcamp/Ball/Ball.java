package org.academiadecodigo.bootcamp.Ball;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Ball{

    private Color color;
    private Ellipse ball;
    private double speed;
    private int ballScore;
    private double x;
    private double y;
    private double width;
    private double height;

    public Ball(Color color, double x, double y, double width, double height, double speed, int ballScore) {
        this.ballScore = ballScore;
        this.speed = speed;
        this.color = color;
        ball = new Ellipse( x, y, width, height);
        ball.setColor(color);
        ball.fill();

    }

    public void ballPosition(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public void moveBall(){
        ball.translate(10 ,0);

    }

    public void newBallMovement(){
        ball.translate(85 ,0);

    }

    public void removeBall(){
        ball.delete();
    }

    public Ellipse getBall() {
        return ball;
    }

    public Color getColor() {
        return color;
    }


    public int getBallScore() {
        return ballScore;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getSpeed() {
        return speed;
    }
}
