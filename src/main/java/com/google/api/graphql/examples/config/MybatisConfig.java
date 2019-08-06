package com.google.api.graphql.examples.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.google.api.graphql.examples.mapper")
public class MybatisConfig {

}
