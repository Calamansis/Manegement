package com.example.demo.configure;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.campus.mapper")
public class MybatisPlusConfig {


    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor()
    {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        PaginationInnerInterceptor paginationInnerInterceptor =new PaginationInnerInterceptor(DbType.MYSQL);

        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }
}
