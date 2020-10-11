package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cadet {

    private Picture picture;

    public Cadet(){
        picture = new Picture(400, 200, "resources/sad.png");
        picture.draw();
    }

    public int getX(){
        return picture.getX();
    }

    public void changePicture(){
        picture.load("resources/happy.jpeg");
    }


}
