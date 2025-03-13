package com.learn.springboot.demo.mycoolapp.Service;

import com.learn.springboot.demo.mycoolapp.Model.Laptop;
import com.learn.springboot.demo.mycoolapp.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LaptopService {

@Autowired
    private LaptopRepository repo;
    public void add(Laptop laptop) {
        System.out.println("method called from LaptopService class");
        repo.save(laptop);

    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }

}