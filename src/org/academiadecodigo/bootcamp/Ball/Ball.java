package org.academiadecodigo.bootcamp.Ball;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Ball {

    private int color;
    private boolean filled;
    private double x;
    private double y;
    private double width;
    private double height;

    private Ellipse ball;
    private int numberOfBalls;

    public Ball(int color,double width,double height,double x,double y){
        this.color = (int)(Math.random() * BallColor.values().length);

    }





}
