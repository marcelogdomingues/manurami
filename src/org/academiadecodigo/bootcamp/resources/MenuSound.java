package org.academiadecodigo.bootcamp.resources;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class MenuSound {

        public static void playSound(File Sound) {

            try {

                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Sound));
                clip.start();

            } catch (Exception e) {

                System.out.println(e);

            }

        }

}
