package com.chasyu.member.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

//Mybatis 설정 영역
//Mybatis는 DAO를 사용하기 편하게 사용하기 위함

@Configuration
@MapperScan(basePackages = {"com.chasyu.member.configuration"})
public class DataSourceConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResource("classpath:/mapper/SelectMapper.xml"));

        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setMapUnderscoreToCamelCase(true);
        config.setAutoMappingBehavior(AutoMappingBehavior.PARTIAL);
        config.setJdbcTypeForNull(JdbcType.NULL);
//        config.getTypeAliasRegistry().registerAliases("com.app.entity");
        sessionFactory.setConfiguration(config);

        return sessionFactory.getObject();
    }
//    Mybatis 설정

    @Bean
    @ConfigurationProperties("spring.datasource.hikari")    // 가장 깔끔한 data source 설정 방법으로 생각됨
    HikariDataSource getDataSource() {
        return new HikariDataSource();
    }


}
