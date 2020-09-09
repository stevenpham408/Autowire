package com.example.autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {
    private FooFormatter fooFormatter;
    @Autowired
    public FooService(FooFormatter fooFormatter){
        System.out.println("Constructor activated!");
        this.fooFormatter = fooFormatter;
//        System.out.println(this.fooFormatter);
        //System.out.println(fooFormatter.format());

    }

    public FooFormatter getFooFormatter() {
        return this.fooFormatter;
    }
}
