package com.learn.springboot.demo.mycoolapp.Repository;

import com.learn.springboot.demo.mycoolapp.Model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap)
    {
        System.out.println("saving from lap repo");

    }
}
