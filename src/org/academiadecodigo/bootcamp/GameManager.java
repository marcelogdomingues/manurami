package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.GameLayout;
import org.academiadecodigo.bootcamp.menu.MenuOption;
import org.academiadecodigo.bootcamp.resources.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import java.io.File;

public class GameManager implements KeyboardHandler {

    private Keyboard keyboard;
    private MenuOption selectedMenuOption;
    // private MC mc;

    public void start(int width, int height, int xMargin, int yMargin, Color backgroundColor){

        selectedMenuOption = MenuOption.START;

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

        GameLayout gameLayout = new GameLayout(width, height, xMargin, yMargin, backgroundColor);
        gameLayout.drawBackground();
        gameLayout.drawTitle(true);
        gameLayout.drawMenu();

        //Perceber com o marcelo como funciona esta parte do sound:
        Sound gameSound = new Sound();
        File soundFile = new File("file_example_WAV_10MG.wav");
        gameSound.playSound(soundFile);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch(keyboardEvent.getKey()){
            case(KeyboardEvent.KEY_W):
                //ir para cima no menu
                break;
            case(KeyboardEvent.KEY_A):
                //nada no menu
                break;
            case(KeyboardEvent.KEY_S):
                //ir para baixo no menu
                break;
            case(KeyboardEvent.KEY_D):
                //nada no menu
                break;
            case(KeyboardEvent.KEY_SPACE):
                //seleccionar opcção
                break;
            default:
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch(keyboardEvent.getKey()){
            case(KeyboardEvent.KEY_W):
                //ir para cima no menu
                break;
            case(KeyboardEvent.KEY_A):
                //nada no menu
                break;
            case(KeyboardEvent.KEY_S):
                //ir para baixo no menu
                break;
            case(KeyboardEvent.KEY_D):
                //nada no menu
                break;
            case(KeyboardEvent.KEY_SPACE):
                //seleccionar opcção
                break;
            default:
                break;
        }
    }

}
