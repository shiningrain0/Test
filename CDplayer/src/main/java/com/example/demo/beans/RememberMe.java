package com.example.demo.beans;

import com.example.demo.interfaces.CDplayer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("POP MUSIC")
@Component
public class RememberMe implements CDplayer {
    @Override
    public String CD(){
        return "Remember me!!!";
    }
}
