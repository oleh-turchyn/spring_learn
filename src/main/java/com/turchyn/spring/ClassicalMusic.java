package com.turchyn.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Classical";

    }
}
