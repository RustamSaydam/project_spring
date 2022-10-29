package ru.saydam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
        /* случайное число между 0 и 2 */
    public void playMusic(MusicGenre genre) {
        Random random = new Random();


        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.ROCK) {
            /* Random Rock music */
            System.out.println(rockMusic.getSongs().get(randomNumber));
        } else {
            /* Random Classical Music */
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        }
    }
}