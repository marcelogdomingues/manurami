package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Ball.Ball;
import org.academiadecodigo.bootcamp.Ball.BallFactory;
import org.academiadecodigo.bootcamp.Ball.BallMover;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game{

    public boolean gameOn = true;

    private static int score = 0;
    private BallFactory ballFactory;
    private BallMover ballMover;
    private int initialSpeed;
    private int initialBallScore;
    private boolean ballPassedLimit;
    private Thread ballCreationThread;
    private Thread ballMovingThread;

    public Game() {
        initialSpeed = 1;
        initialBallScore = 1;
        ballFactory = new BallFactory(initialSpeed, initialBallScore, 7);
        this.gameOn = true;
    }

    public int getScore() {
        return score;
    }

    public boolean isGameOn() {
        return gameOn;
    }

    public void setGameOn(boolean gameOn) {
        this.gameOn = gameOn;
    }

    public void beginGame(){
        ballMover = new BallMover(ballFactory);
        ballCreationThread = new Thread(ballFactory);
        ballMovingThread = new Thread(ballMover);
        ballCreationThread.start();
        ballMovingThread.start();
    }

    public void stopGame(){
        ballFactory.setActivated(false);
        ballMover.setActivated(false);
        for (Ball ball : ballFactory.getBalls()) {
            if (ball != null) {
                ball.getBall().delete();
            }
        }
    }

        /* public void startBalls() {

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
     */
    //}
        /*
        public void delete() {
            delete = ball.getY();
            if (delete >= game) {
                Canvas.getInstance().hide((Shape) this);
            }
        }
         */

    /*
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

    public void setScore(int score) {
        this.score = score;
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
    */

}
