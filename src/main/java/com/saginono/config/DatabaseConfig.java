package com.saginono.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.saginono.repository")
public class DatabaseConfig {
  // 데이터베이스 설정 관련 코드
}
