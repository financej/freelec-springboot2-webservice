package com.financej.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBootApplication 어노테이션은 스프링부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
//항상 프로젝트 최상단에 위치해야한다
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
