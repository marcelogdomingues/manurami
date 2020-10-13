package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.menu.MenuOption;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class GameLayout {

    private int width;
    private int height;
    private int xMargin;
    private int yMargin;
    private Color backgroundColor;
    private Rectangle marker;
    private Text title;
    private Text[] menuOptions = new Text[MenuOption.values().length];
    private Text instructions;
    private Text credits;

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

    public void drawBackground(){
        Rectangle rectangle = new Rectangle(xMargin, yMargin, width, height);
        rectangle.setColor(backgroundColor);
        rectangle.fill();
    }

    public void drawTitle(){
        title = new Text(width/2 - xMargin, 100, "MANURAMI");
        title.grow(100, 40);
        title.setColor(Color.WHITE);
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
        if (marker != null){
            System.out.println(marker.getX() +"er:" + marker.getY());

        }
        marker = new Rectangle(300, 205, 10, 10);
        if (marker != null){
            System.out.println(marker.getX() +":" + marker.getY());

        }
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

    public void drawGame() {
        GameDisplay gameDisplay = new GameDisplay();
        gameDisplay.drawTextScore(this);
        //gameDisplay.drawSupportKeys();
        gameDisplay.drawKeyA();
        gameDisplay.drawKeyS();
        gameDisplay.drawKeyD();
        gameDisplay.drawEllipse(this);
        System.out.println();
    }

    public void closeGame(){

    }

    public void drawInstructions(){
        instructions = new Text(width/2 - xMargin, height/2 - yMargin, "Instructions...");
        instructions.grow(20, 8);
        instructions.setColor(Color.WHITE);
        instructions.draw();
    }

    public void closeInstructions(){
        instructions.delete();
    }

    public void drawCredits(){
        credits = new Text(width/2 - xMargin, height/2 - yMargin, "Credits...");
        credits.grow(20, 8);
        credits.setColor(Color.WHITE);
        credits.draw();
    }

    public void closeCredits(){
        credits.delete();
    }

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
