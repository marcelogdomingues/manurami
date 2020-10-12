package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.menu.Menu;
import org.academiadecodigo.bootcamp.menu.MenuFormat;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.zip.CheckedOutputStream;

public class GameLayout {

    private int width;
    private int height;
    private int xMargin;
    private int yMargin;
    private Color backgroundColor;

    public GameLayout(int width, int height, int xMargin, int yMargin, Color backgroundColor) {
        this.width = width;
        this.height = height;
        this.xMargin = xMargin;
        this.yMargin = yMargin;
        this.backgroundColor = backgroundColor;
    }

    public void drawBackground(){
        Rectangle rectangle = new Rectangle(xMargin, yMargin, width, height);
        rectangle.setColor(backgroundColor);
        rectangle.fill();
    }

    public void drawMenu(boolean visible){
        Text title = new Text(width/2 - xMargin, 100, "MANURAMI");
        title.grow(100, 40);
        title.setColor(Color.WHITE);
        title.draw();
        MenuFormat menuFormat = new MenuFormat();
        menuFormat.drawMenuOption();
    }
}
