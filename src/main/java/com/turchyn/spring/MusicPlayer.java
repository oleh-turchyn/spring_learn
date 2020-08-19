package com.turchyn.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer(List<Music> musicList) {
        this.musicList=musicList;
    }
    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playAllMusic() {
        System.out.println("playing all");
        for (Music mus : musicList) {
            System.out.println("Playing: " + mus.getSong());
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
