package org.academiadecodigo.bootcamp.resources;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip; //Musica
import javax.sound.sampled.FloatControl; // Controls the sound Volume
import java.io.File;

public class Sound {

    public static void playSound(File sound) {

        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f); //Reduz 20 decibeis
            clip.start();

        } catch (Exception e) {

            System.out.println(e);

        }


    }

}