package org.academiadecodigo.bootcamp.menu;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuFormat {

    private Text menuStart = new Text(350, 200, "Start");
    private Text instructions = new Text(350, 250, "Instructions");
    private Text credits = new Text(350, 300, "Credits");
    private Text menuQuit = new Text(350, 350, "Quit");


    public void MenuFormat(){

        this.menuStart = menuStart;
        this.instructions = instructions;
        this.credits = credits;
        this.menuQuit = menuQuit;


    }

    public void drawMenuOption(){

        {
            menuStart.grow(20, 8);
            menuStart.setColor(Color.WHITE);
            menuStart.draw();
        }

        {
            instructions.grow(20, 8);
            instructions.setColor(Color.WHITE);
            instructions.draw();
        }

        {
            credits.grow(20, 8);
            credits.setColor(Color.WHITE);
            credits.draw();
        }

        {
            menuQuit.grow(20, 8);
            menuQuit.setColor(Color.WHITE);
            menuQuit.draw();
        }



    }

}
