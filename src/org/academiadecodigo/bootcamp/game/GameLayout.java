package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.menu.MenuOption;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameLayout {

    private int width;
    private int height;
    private int xMargin;
    private int yMargin;
    private Color backgroundColor;
    private Rectangle marker;
    private Text[] menuOptions = new Text[MenuOption.values().length];
    private Picture instructions;
    private Picture credits;
    private Ellipse target;
    private Picture supportKeys;
    private Picture title;
    private Text textScore;
    private Text scoreValue;

    public GameLayout(int width, int height, int xMargin, int yMargin, Color backgroundColor) {
        this.width = width;
        this.height = height;
        this.xMargin = xMargin;
        this.yMargin = yMargin;
        this.backgroundColor = backgroundColor;
    }

    public Rectangle getMarker() {
        return marker;
    }

    public Ellipse getTarget() {
        return target;
    }

    public void drawBackground(){
        Rectangle rectangle = new Rectangle(xMargin, yMargin, width, height);
        rectangle.setColor(backgroundColor);
        rectangle.fill();
    }

    public void drawTitle(){
        title = new Picture(90 + xMargin, 50, "resources/img/manurami.png");
        title.draw();
    }

    public void drawMenuOptions(MenuOption optionName){
        int indexMenuOption = MenuOption.valueOf(optionName.toString()).ordinal();
        int spacing = indexMenuOption * 50;
        menuOptions[indexMenuOption] = new Text(350, 200 + spacing, optionName.toString());
        menuOptions[indexMenuOption].setColor(Color.WHITE);
        menuOptions[indexMenuOption].grow(20, 8);
        menuOptions[indexMenuOption].draw();
    }

    public void drawMarker(){
        marker = new Rectangle(300, 205, 10, 10);
        marker.setColor(Color.WHITE);
        marker.fill();
    }

    public void drawMenu(){
        drawTitle();
        for(MenuOption menuOption : MenuOption.values()){
            drawMenuOptions(menuOption);
        }
        drawMarker();
    }

    public void closeMenu(){
        title.delete();
        marker.delete();
        for(Text menuOption : menuOptions){
            menuOption.delete();
        }
    }

    public void drawGame(int score) {
        drawTextScore(this);
        drawSupportKeys();
        drawScoreValue(this, score);
        drawTarget(this);
    }

    public void closeGame(){
        target.delete();
        supportKeys.delete();
        textScore.delete();
        scoreValue.delete();
    }

    public void drawTarget(GameLayout gameLayout) {
        target = new Ellipse(gameLayout.getWidth() / 2, gameLayout.getHeight() / 2, 50, 50);
        target.setColor(Color.WHITE);
        target.draw();
    }

    public void drawSupportKeys() {
        supportKeys = new Picture(500, 600, "resources/img/asd.png");
        supportKeys.draw();
    }

    public void drawTextScore(GameLayout gameLayout) {
        textScore = new Text(380 - gameLayout.getxMargin(), 80, "Score");
        textScore.grow(60, 30);
        textScore.setColor(Color.WHITE);
        textScore.draw();
    }

    public void drawScoreValue(GameLayout gameLayout, int score) {
        scoreValue = new Text(380 - gameLayout.getxMargin(), 140, Integer.toString(score));
        scoreValue.grow(15, 30);
        scoreValue.setColor(Color.WHITE);
        scoreValue.draw();
    }

    public void drawInstructions(){

        instructions = new Picture(10,10, "resources/img/instructions.png");
        //instructions = new Text(width/2 - xMargin, 100, "Instructions:");
        //instructions.grow(20, 8);
        //instructions.setColor(Color.WHITE);
        instructions.draw();
    }

    public void closeInstructions(){
        instructions.delete();
    }

    public void drawCredits(){
        //credits = new Text(width/2 - xMargin, height/2 - yMargin, "Credits: ");
        //credits.grow(20, 8);
        //credits.setColor(Color.WHITE);
        credits = new Picture(10, 10, "resources/img/credits.png");
        credits.draw();
    }

    public void closeCredits(){
        credits.delete();
    }

    public void drawLoadingScreen() {
        Picture loadingScreen = new Picture(10, 10, "resources/img/loading.png");
        loadingScreen.draw();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
        loadingScreen.delete();
    }

    /*public void closeLoadingScreen(){
        loadingScreen.delete();
    }*/

    public int getHeight() {
        return height;
    }

    public int getxMargin() {
        return xMargin;
    }

    public int getWidth() {
        return width;
    }

    public int getyMargin() {
        return yMargin;
    }
}
