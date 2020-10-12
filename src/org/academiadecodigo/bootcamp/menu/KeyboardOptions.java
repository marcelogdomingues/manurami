package org.academiadecodigo.bootcamp.menu;

import org.academiadecodigo.bootcamp.game.GameLayout;
import org.academiadecodigo.bootcamp.resources.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.awt.event.KeyEvent;
import java.io.File;

public class KeyboardOptions implements KeyboardHandler {

    private Keyboard keyboard;
    private GameLayout gameLayout;
    private MenuOption selectedMenuOption;
    private boolean menuLocked;

    public void menuOptions(GameLayout gameLayout){

        this.gameLayout = gameLayout;

        selectedMenuOption = MenuOption.values()[0];

        {
            keyboard = new Keyboard(this);
            KeyboardEvent wPressed = new KeyboardEvent();
            wPressed.setKey(KeyboardEvent.KEY_W);
            wPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(wPressed);
        } //Listening to W key

        {
            keyboard = new Keyboard(this);
            KeyboardEvent aPressed = new KeyboardEvent();
            aPressed.setKey(KeyboardEvent.KEY_A);
            aPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(aPressed);
        } //Listening to A key

        {
            keyboard = new Keyboard(this);
            KeyboardEvent sPressed = new KeyboardEvent();
            sPressed.setKey(KeyboardEvent.KEY_S);
            sPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(sPressed);
        } //Listening to S key

        {
            keyboard = new Keyboard(this);
            KeyboardEvent dPressed = new KeyboardEvent();
            dPressed.setKey(KeyboardEvent.KEY_D);
            dPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(dPressed);
        } //Listening to D key

        {
            keyboard = new Keyboard(this);
            KeyboardEvent spacePressed = new KeyboardEvent();
            spacePressed.setKey(KeyboardEvent.KEY_SPACE);
            spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(spacePressed);
        } //Listening to SPACE key

        {
            keyboard = new Keyboard(this);
            KeyboardEvent enterPressed = new KeyboardEvent();
            enterPressed.setKey(KeyEvent.VK_ENTER);
            enterPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(enterPressed);
        }


    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        Sound menuSound = new Sound();
        File soundFile = new File("resources/sounds/btn_sound_menu.wav");
        menuSound.playSound(soundFile);

        switch (keyboardEvent.getKey()) {

            case (KeyboardEvent.KEY_W):

                if (!menuLocked) {

                    if (selectedMenuOption == MenuOption.values()[0]) {
                        gameLayout.getMarker().translate(0, 50 * (MenuOption.values().length - 1));
                        selectedMenuOption = MenuOption.values()[MenuOption.values().length - 1];

                    } else {

                        gameLayout.getMarker().translate(0, -50);
                        selectedMenuOption = MenuOption.values()[MenuOption.valueOf(selectedMenuOption.toString()).ordinal() - 1];

                    }
                }

                break;

            case (KeyboardEvent.KEY_A):
                //nada no menu
                break;

            case (KeyboardEvent.KEY_S):

                if (!menuLocked) {

                    if (selectedMenuOption == MenuOption.values()[MenuOption.values().length - 1]) {
                        gameLayout.getMarker().translate(0, -50 * (MenuOption.values().length - 1));
                        selectedMenuOption = MenuOption.values()[0];

                    } else {

                        gameLayout.getMarker().translate(0, 50);
                        selectedMenuOption = MenuOption.values()[MenuOption.valueOf(selectedMenuOption.toString()).ordinal() + 1];

                    }
                }

                break;

            case (KeyboardEvent.KEY_D):
                //nada no menu
                break;

            case (KeyboardEvent.KEY_SPACE):

                if (!menuLocked) {

                    if (selectedMenuOption == MenuOption.EXIT) {

                        System.exit(0);

                    } else {

                        gameLayout.closeMenu();
                        gameLayout.drawInstructions();
                        menuLocked = true;

                    }

                } else {

                    gameLayout.closeInstructions();
                    gameLayout.drawMenu();
                    gameLayout.getMarker().translate(0, 50 * (MenuOption.valueOf(selectedMenuOption.toString()).ordinal()));
                    menuLocked = false;

                }

            case (KeyEvent.VK_ENTER):

                if (!menuLocked) {

                    if (selectedMenuOption == MenuOption.EXIT) {

                        System.exit(0);

                    } else {

                        gameLayout.closeMenu();
                        gameLayout.drawInstructions();
                        menuLocked = true;

                    }

                } else {

                    gameLayout.closeInstructions();
                    gameLayout.drawMenu();
                    gameLayout.getMarker().translate(0, 50 * (MenuOption.valueOf(selectedMenuOption.toString()).ordinal()));
                    menuLocked = false;

                }

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


}
