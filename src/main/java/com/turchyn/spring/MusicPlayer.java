package com.turchyn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSongs() + ", " + music2.getSongs();
    }

    public void playMusic2(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNum = random.nextInt(3);

        if(musicGenre == MusicGenre.ROCK){
            System.out.println(music1.getSongs().get(randomNum));
        }
        else {
            System.out.println(music2.getSongs().get(randomNum));
        }
    }
}
