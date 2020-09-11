package com.yeon.template.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// mybatis의 Dao DB Layer 접근자. <Entity 클래스, PK 타입>. 기본 CRUD 생성됨
// Entity 클래스와 함께 위치 해야함.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
