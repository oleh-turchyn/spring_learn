package com.turchyn.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Loosing my mind");
        songs.add("Unforgiven II");
        songs.add("Holy Diver");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
