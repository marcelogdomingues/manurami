package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Ball.BallFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Text textScore;
    private Text scoreValue;
    private String score = "0";
    private Ellipse target;
    private Picture supportKeys;
    private Rectangle keyA;
    private Rectangle keyS;
    private Rectangle keyD;
    private Rectangle keyW;
    private BallFactory ballFactory;
    private int initialSpeed;
    private int initialBallScore;
    private boolean ballPassedLimit;
    private boolean hasBalls;

    public Game() {
        initialSpeed = 1;
        initialBallScore = 1;
        ballFactory = new BallFactory(initialSpeed, initialBallScore, 4);
    }

    public void startBalls() {

      /*  while (!ballPassedLimit) {
            try {
                //Thread.sleep(1000);
                ballFactory.makeBall();
            } catch (Exception ex) {

                System.out.println(ex.getMessage());

            }*/

        // ballFactory.makeBall();
//
        while (!ballPassedLimit) {

            for (int i = 0; i < ballFactory.getBalls().length; i++) {

                ballFactory.makeBall();

                for (int j = 0; j <= i; j++) {

                    ballFactory.getBalls()[j].newBallMovement();

                }

            }

            ballPassedLimit = true;

        }

        try {

            new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            for (int i = 0; i <= ballFactory.getBalls().length - 1; i++) {

                                ballFactory.getBalls()[i].moveBall();

                            }

                            Thread.sleep(400);
                        }
                    } catch (InterruptedException ie) {

                        System.err.println(ie.getMessage());

                    }
                }
            }).start();


        } catch (Exception e) {

            System.err.println(e.getMessage());

        }


    }
    //}

    public void drawTextScore(GameLayout gameLayout) {
        textScore = new Text(gameLayout.getWidth() / 2 - gameLayout.getxMargin(), 80, "Score");
        textScore.grow(60, 30);
        textScore.setColor(Color.WHITE);
        textScore.draw();
    }

    public void drawScoreValue(GameLayout gameLayout) {
        scoreValue = new Text(gameLayout.getWidth() / 2 - gameLayout.getxMargin(), 140, score);
        scoreValue.grow(15, 30);
        scoreValue.setColor(Color.WHITE);
        scoreValue.draw();
    }

    public void setScore(String score) {
        this.score = score;
        System.out.println();
    }

    public void drawTarget(GameLayout gameLayout) {
        target = new Ellipse(gameLayout.getWidth() / 2, gameLayout.getHeight() / 2, 50, 50);
        target.setColor(Color.WHITE);
        target.draw();
    }

    /*public void drawSupportKeys() {
        supportKeys = new Picture(300, 300, "resources/img/ASD.png");
        supportKeys.grow(120, 40);
        supportKeys.draw();
    }*/

    public void drawKeyA() {
        keyA = new Rectangle(555, 600, 40, 40);
        keyA.setColor(Color.CYAN);
        keyA.fill();
    }

    public void drawKeyS() {
        keyS = new Rectangle(600, 600, 40, 40);
        keyS.setColor(Color.MAGENTA);
        keyS.fill();
    }

    public void drawKeyD() {
        keyD = new Rectangle(645, 600, 40, 40);
        keyD.setColor(Color.YELLOW);
        keyD.fill();
    }

    public void drawDisplay() {
        setScore("10");
    }
}
