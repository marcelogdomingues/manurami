package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.GameLayout;
import org.academiadecodigo.bootcamp.menu.KeyboardOptions;
import org.academiadecodigo.bootcamp.menu.MenuOption;
import org.academiadecodigo.bootcamp.resources.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.awt.event.KeyEvent;
import java.io.File;

public class GameManager {

    private Keyboard keyboard;
    private GameLayout gameLayout;
    private MenuOption selectedMenuOption;
    private boolean menuLocked;

    public void start(int width, int height, int xMargin, int yMargin, Color backgroundColor) {

        KeyboardOptions keyboardOptions = new KeyboardOptions();

        gameLayout = new GameLayout(width, height, xMargin, yMargin, backgroundColor);
        gameLayout.drawBackground();
        gameLayout.drawMenu();
        keyboardOptions.menuOptions(gameLayout);

        //Perceber com o marcelo como funciona esta parte do sound:
        Sound gameSound = new Sound();
        File soundFile = new File("resources/sounds/menu_sound.wav");
        gameSound.playSound(soundFile);
    }


}
