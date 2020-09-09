package com.example.autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {
    // @Autowire
    /**
    * Autowiring by injecting into a property is bad practice. Avoid doing so.
     **/
    private FooFormatter fooFormatter;

    /** Autowiring by injecting into a constructor is good practice,
     *  the next better one being Lombok library
     **/
    @Autowired
    public FooService(FooFormatter fooFormatter){
        System.out.println("Constructor activated!");
        this.fooFormatter = fooFormatter;
        System.out.println(fooFormatter.format());

    }
    public FooFormatter getFooFormatter() {
        return this.fooFormatter;
    }
}
