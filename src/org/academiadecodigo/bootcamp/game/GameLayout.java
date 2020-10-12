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

    public void drawTitle(boolean visible){
        title = new Text(width/2 - xMargin, 100, "MANURAMI");
        title.grow(100, 40);
        title.setColor(Color.WHITE);
        title.draw();
    }

    public void drawMenuOptions(boolean visible, MenuOption optionName){
        int spacing = MenuOption.valueOf(optionName.toString()).ordinal() * 50;
        menuOptions[MenuOption.valueOf(optionName.toString()).ordinal()] = new Text(350, 200 + spacing, optionName.toString());
        menuOptions[MenuOption.valueOf(optionName.toString()).ordinal()].setColor(Color.WHITE);
        menuOptions[MenuOption.valueOf(optionName.toString()).ordinal()].grow(20, 8);
        menuOptions[MenuOption.valueOf(optionName.toString()).ordinal()].draw();
    }

    public void drawMarker(){
        marker = new Rectangle(300, 205, 10, 10);
        marker.setColor(Color.WHITE);
        marker.fill();
    }

    public void drawMenu(){
        for(MenuOption menuOption : MenuOption.values()){
            drawMenuOptions(true, menuOption);
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
}
