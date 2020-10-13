package org.academiadecodigo.bootcamp.resources;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;

public class MenuSound {

    public static void playSound(File Sound) {

        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(20.0f); // Aumenta 10 decibeis
            clip.start();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public static void stopSound(File sound) {

        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f); //Reduz 20 decibeis
            clip.stop();

        } catch (Exception e) {

            System.out.println(e);

        }


    }

    public static void loopSound(File sound, int loopQuantity) {

        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f); //Reduz 20 decibeis
            clip.loop(loopQuantity);

        } catch (Exception e) {

            System.out.println(e);

        }


    }

}
