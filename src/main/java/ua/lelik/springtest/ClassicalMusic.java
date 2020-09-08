package ua.lelik.springtest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music {
    private List<String> list = new ArrayList<>();
    
    {
        for(int i = 0; i < 3; i++) {
            list.add(getClass().getName() + " " + (i+1) + " Heraldian Rhapsody");
        }
    }
    
    @Override
    public List<String> getSongs() {
        return list;
    }


//    private ClassicalMusic() {
//    }
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
////    }
//    @PostConstruct
//    public void doMyInit() {
//        System.out.println("Do my initialization");
//    }
//    @PreDestroy
//    public void destroyMethod() {
//        System.out.println("Destroy method");
//    }
}
