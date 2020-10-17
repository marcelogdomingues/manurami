package org.academiadecodigo.bootcamp.Ball;

public class BallMover implements Runnable{

    private BallFactory ballFactory;
    private boolean activated;

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public BallMover(BallFactory ballFactory) {
        this.ballFactory = ballFactory;
    }

    @Override
    public void run() {
        while (true) {
            for (Ball ball : ballFactory.getBalls()) {
                if (ball != null) {
                    if (ball.getBall().getX() < 400) {
                        ball.moveBall();
                    } else {
                        ball.getBall().delete();
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
        }
    }
}
