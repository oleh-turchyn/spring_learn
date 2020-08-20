package com.turchyn.spring;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "In Da Club";
    }
}
