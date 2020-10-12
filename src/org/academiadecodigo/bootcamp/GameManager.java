package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.GameLayout;
import org.academiadecodigo.bootcamp.menu.KeyboardOptions;
import org.academiadecodigo.bootcamp.resources.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.io.File;

public class GameManager {

    private GameLayout gameLayout;

    public void start(int width, int height, int xMargin, int yMargin, Color backgroundColor) {

        KeyboardOptions keyboardOptions = new KeyboardOptions();

        gameLayout = new GameLayout(width, height, xMargin, yMargin, backgroundColor);
        gameLayout.drawBackground();
        gameLayout.drawMenu();

        Sound gameSound = new Sound();
        File soundFile = new File("resources/sounds/menu_sound.wav");
        gameSound.playSound(soundFile);
    }


}
