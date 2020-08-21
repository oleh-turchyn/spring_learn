package com.turchyn.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Classical1");
        songs.add("Classical12");
        songs.add("Classical13");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
