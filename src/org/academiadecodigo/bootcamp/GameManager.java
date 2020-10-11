package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class GameManager implements KeyboardHandler {

    private Keyboard keyboard;
    // private MC mc;

    public void start(){

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
    }

    /* public void setMc(MC mc) {
        this.mc = mc;
    } */

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        /*if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            mc.moveRight();
        }*/

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

    public void drawBackground(Color backgroundColor, int xMargin, int yMargin, int width, int height){
        Rectangle rectangle = new Rectangle(xMargin, yMargin, width, height);
        rectangle.setColor(backgroundColor);
        rectangle.fill();
    }
}
