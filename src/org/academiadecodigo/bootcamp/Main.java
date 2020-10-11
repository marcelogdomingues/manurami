package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Main {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10, 10, 800, 1000);
        rectangle.setColor(Color.CYAN);
        rectangle.fill();

        Ellipse ellipse = new Ellipse(50, 50, 100, 100);
        ellipse.fill();

        Text text = new Text(600, 100, "cursed handson");
        text.grow(100, 100);
        text.draw();

        Cadet cadet = new Cadet();

        MC mc = new MC();
        mc.setCadet(cadet);

        Controls controls = new Controls();
        controls.setMc(mc);

        controls.init();

    }
}
