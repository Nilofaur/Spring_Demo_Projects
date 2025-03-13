package com.learn.springboot.demo.mycoolapp.Model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

    @Component
    @Primary
    public class Desktop implements Computer {
        @Override
        public void compile() {
            System.out.println("compiling from desktop");

        }
}
