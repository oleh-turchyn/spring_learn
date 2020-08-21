package com.turchyn.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("In da Club");
        songs.add("Cadillac");
        songs.add("Plain Jane");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
