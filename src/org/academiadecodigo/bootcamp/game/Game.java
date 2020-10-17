package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Ball.Ball;
import org.academiadecodigo.bootcamp.Ball.BallFactory;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    public boolean gameOn = true;

    private Ball ball;
    private Ellipse ellipse;
    private double delete;
    private Text textScore;
    private Text scoreValue;
    private static int score = 0;
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
    private Boolean KeyPressed;

    public Game() {
        initialSpeed = 1;
        initialBallScore = 1;
        ballFactory = new BallFactory(initialSpeed, initialBallScore, 7);
        this.gameOn = true;
    }

    public void startBalls() {

        try {

            new Thread(new Runnable() {
                public void run() {

                    try {

                        gameOn = true;

                        //if vidas < 3 false

                        while (!ballPassedLimit) {

                            for (int i = 0; i < ballFactory.getBalls().length; i++) {

                                ballFactory.makeBall();

                                for (int j = 0; j <= i; j++) {

                                    ballFactory.getBalls()[j].newBallMovement();

                                }

                            }

                            ballPassedLimit = true;

                        }

                        while (gameOn) {
                            for (int i = 0; i <= ballFactory.getBalls().length - 1; i++) {


                                if (ballFactory.getBalls()[i].getBall().getX() + 10 < 700 - 48) {

                                    ballFactory.getBalls()[i].moveBall();

                                    //Apaga as Bolas no Final e Da Respawn

                                } else {

                                    ballFactory.getBalls()[i].getBall().delete();
                                    ballFactory.makeBall();

                                }

                            }

                            Thread.sleep(300);

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
        /*
        public void delete() {
            delete = ball.getY();
            if (delete >= game) {
                Canvas.getInstance().hide((Shape) this);
            }
        }
         */

    public void aPressed() {

        for (int i = 0; i <= ballFactory.getBalls().length - 1; i++) {

            if (ballFactory.getBalls()[i].getBall().getColor() == Color.CYAN && ballFactory.getBalls()[i].getBall().getX() == (700 / 2) - 5) {

                deleteCyanBall(ballFactory.getBalls()[i]);

            }

        }

    }

    public void sPressed() {

        for (int i = 0; i <= ballFactory.getBalls().length - 1; i++) {

            if (ballFactory.getBalls()[i].getBall().getColor() == Color.MAGENTA && ballFactory.getBalls()[i].getBall().getX() == (700 / 2) - 5) {

                deleteMangetaBall(ballFactory.getBalls()[i]);

            }

        }

    }

    public void dPressed() {

        for (int i = 0; i <= ballFactory.getBalls().length - 1; i++) {


            if (ballFactory.getBalls()[i].getBall().getColor() == Color.YELLOW && ballFactory.getBalls()[i].getBall().getX() == (700 / 2) - 5) {

                deleteYellowBall(ballFactory.getBalls()[i]);

            }

        }

    }

    public void drawTextScore(GameLayout gameLayout) {
        textScore = new Text(gameLayout.getWidth() / 2 - gameLayout.getxMargin(), 80, "Score");
        textScore.grow(60, 30);
        textScore.setColor(Color.WHITE);
        textScore.draw();
    }

    public void drawScoreValue(GameLayout gameLayout) {
        scoreValue = new Text(gameLayout.getWidth() / 2 - gameLayout.getxMargin(), 140, Integer.toString(score));
        scoreValue.grow(15, 30);
        scoreValue.setColor(Color.WHITE);
        scoreValue.draw();
    }

    public void setScore(int score) {
        this.score = score;
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

    public void deleteMangetaBall(Ball ball) {

        ball.removeBall();

    }

    public void deleteCyanBall(Ball ball) {

        ball.removeBall();

    }

    public void deleteYellowBall(Ball ball) {


        ball.removeBall();

    }

    public Boolean deleteYBall(Boolean KeyPressed) {
        return KeyPressed;
    }

    public void drawDisplay() {
        setScore(0);
    }

    public boolean isGameOn() {
        return gameOn;
    }

    public int getScore() {
        return score;
    }


}