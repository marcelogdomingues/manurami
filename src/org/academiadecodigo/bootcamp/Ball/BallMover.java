package org.academiadecodigo.bootcamp.Ball;

public class BallMover implements Runnable{

    private BallFactory ballFactory;
    private boolean activated;

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public BallMover(BallFactory ballFactory) {
        this.ballFactory = ballFactory;
        activated = true;
    }
    @Override
    public void run() {
        while (activated) {
            for (Ball ball : ballFactory.getBalls()) {
                if (ball != null) {
                    if (ball.getBall().getX() < 600) {
                        ball.moveBall();
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
        }
    }
}
