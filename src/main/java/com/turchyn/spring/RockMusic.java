package com.turchyn.spring;

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
