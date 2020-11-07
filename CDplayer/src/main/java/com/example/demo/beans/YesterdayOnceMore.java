package com.example.demo.beans;

import com.example.demo.interfaces.CDplayer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("classic music")
@Component
public class YesterdayOnceMore implements CDplayer {
    @Override
    public String CD(){
        return "Yesterday once more!!!";
    }
}
