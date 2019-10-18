package net.zld.egou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.zld.egou.mapper")
public class RestApplication8001_App {
    public static void main(String[] args){
        SpringApplication.run(RestApplication8001_App.class,args);
    }
}
