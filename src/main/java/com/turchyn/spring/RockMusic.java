package com.turchyn.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public void myInit(){
        System.out.println("doing my init");
    }

    public void myDestroy(){
        System.out.println("doing my destroy");
    }
    @Override
    public String getSong() {
        return "Loosing my Mind";
    }
}
