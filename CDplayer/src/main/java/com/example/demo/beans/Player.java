package com.example.demo.beans;

import com.example.demo.interfaces.CDplayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Autowired
    @Qualifier("classic music")
    private CDplayer CDplayer;
    public String playMusic(){return CDplayer.CD();}
}
