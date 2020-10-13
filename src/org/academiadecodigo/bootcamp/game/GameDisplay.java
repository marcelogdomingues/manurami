package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameDisplay {

    private Text textScore;
    private Text scoreValue;
    private String score = "0";
    private Ellipse target;
    private Rectangle keyA;
    private Rectangle keyS;
    private Rectangle keyD;
    private Rectangle keyW;

    public GameDisplay() {

    }

    public void drawTextScore(GameLayout gameLayout) {
        textScore = new Text(gameLayout.getWidth()/2 - gameLayout.getxMargin(), 100, "Score");
        textScore.grow(100, 40);
        textScore.setColor(Color.WHITE);
        textScore.draw();
    }

    public void drawScoreValue(GameLayout gameLayout) {
        scoreValue = new Text(400, 300, score);
        scoreValue.grow(150, 40);
        scoreValue.setColor(Color.WHITE);
        scoreValue.draw();
    }

    public void setScore(String score) {
        this.score = score;
    }

    /*public void drawEllipse() {
        target = new Ellipse();

    }*/

    public void drawKeyA() {
        keyA = new Rectangle(300, 200, 10, 10);
        keyA.setColor(Color.CYAN);
        keyA.fill();
    }

    /*public void drawKeyS() {
        keyS = new Rectangle();
        keyS.setColor(Color.MAGENTA);
        keyS.fill();
    }

    public void drawKeyD() {
        keyD = new Rectangle();
        keyD.setColor(Color.YELLOW);
        keyD.fill();
    }*/

    public void drawGame() {
        setScore("10");
    }
}
