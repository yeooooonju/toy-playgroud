package com.yeon.template.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
// 선언된 모든 final필드가 포함 생성자를 생성해줌
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
