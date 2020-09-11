package com.yeon.template.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// lombok
@Getter
@NoArgsConstructor
// jpa (테이블과 링크될 클래스, 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍으로 테이블 미름 매칭)
@Entity
// 실제 DB와 매칭될 클래스 (보통 Entity 클래스라 )
public class Posts {

    // PK 필드
    @Id
    // PK 생성 규칙
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    // 기본적으로 모든 필드는 컬럼이 되지만 옵션 변경시 사용
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // 해당 클래스의 빌더 패턴 클래스 생성. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
