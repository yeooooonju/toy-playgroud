package com.yeon.template.dto;

import com.yeon.template.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // assertj 테스트 검증 라이브러리의 검증 메소드
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
