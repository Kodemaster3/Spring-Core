package ua.lelik.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class InstrumentalMusic implements Music {
    private List<String> list = new ArrayList<>();
    
    {
        for(int i = 0; i < 3; i++) {
            list.add(getClass().getName() + " " + (i+1) + " Dude music");
        }
    }
    @Override
    public List<String> getSongs() {
        
        return list;
       
    }
}
