package com.turchyn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //Music music = context.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        MusicPlayer musicPlayer2 = context.getBean("musicList",MusicPlayer.class);
//        musicPlayer2.playAllMusic();

//        RockMusic rockMusic = context.getBean("musicBean1",RockMusic.class);
//        System.out.println(rockMusic.getSong());
//        RockMusic rockMusic2 = context.getBean("musicBean1",RockMusic.class);
//        System.out.println(rockMusic2.getSong());

//        Music music = context.getBean("rapMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music2 = context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic3());

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
