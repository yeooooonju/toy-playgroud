package com.yeon.template;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링 부투의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정. 해당 위치부터 설정을 읽거가기 떄문에 항상 최 상단에 위치 해야함.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 내장 WAS 실행 (스프링 부터로 만들어진 Jar파일 로 실행 가능해짐)
        SpringApplication.run(Application.class, args);
    }
}
