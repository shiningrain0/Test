package com.example.demo.beans;

import com.example.demo.interfaces.CDplayer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("ROCK MUSIC")
@Component//@component （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class BeatIt implements CDplayer {
    @Override
    public  String CD(){
        return "Beat it!!!";
    }
}
