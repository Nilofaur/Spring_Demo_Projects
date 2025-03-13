package com.learn.springboot.demo.mycoolapp.Model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("compiling from laptop");

    }
}
