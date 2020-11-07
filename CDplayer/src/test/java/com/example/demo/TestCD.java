package com.example.demo;

import com.example.demo.beans.Player;
import com.example.demo.interfaces.CDplayer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCD {
    @Autowired//@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
    @Qualifier("classic music")
    private CDplayer _CDplayer;
    @Autowired
    private Player _Player;

    @Test
    public void CDplayerShouldNotBeNull() {
        Assert.assertNotNull(_CDplayer);
    }
    @Test
    public void CDplayerPlayCD() {
        Assert.assertEquals("Yesterday once more!!!", _Player.playMusic());
    }
}
