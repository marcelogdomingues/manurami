package org.academiadecodigo.bootcamp.resources;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;

public class Sound {

    public static void playSound(File Sound) {

        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f); //Reduz 20 decibeis
            clip.start();

        } catch (Exception e) {

            System.out.println(e);

        }


    }

}