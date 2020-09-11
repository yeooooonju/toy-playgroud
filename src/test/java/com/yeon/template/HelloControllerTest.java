package com.yeon.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;

// 테스트 진행 시 JUnit에 내장된 실행자 외 SpringRunner라는 실행자 사용. 즉 스프링 부와 JUnit 연결
@RunWith(SpringRunner.class)
// Web(Spring MVC)에 집중. Controller관련
@WebMvcTest
public class HelloControllerTest {

    // 스프링 관리하는 빈 주입
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된() throws Exception{
        String hello = "hello";
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));

    }

    @Test
    public void helleDto가_리턴된다() throws Exception{
        String name = "hello";
        int amount = 1000;
        mvc.perform(get("/hello/dto").param("name", name)
                                                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                // JSON응답값을 필드별로 검증할 수 있는 메소드
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
