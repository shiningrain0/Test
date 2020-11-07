package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//@Configuration可理解为用spring的时候xml里面的<beans>标签,作用为：配置spring容器(应用上下文)
@ComponentScan//@ComponentScan告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器。
public class javaconfig {
}
