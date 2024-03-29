package com.bys.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Configuration
@PropertySource("classpath:/application.properties")
public class DatabaseConfiguration {
	@Autowired
	private ApplicationContext applicationContext;
	
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource.hikari")
//	public HikariConfig hikariConfig() {
//		return new HikariConfig();
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		DataSource dataSource = new HikariDataSource(hikariConfig());
//		log.info("datasource : {}", dataSource);
//		return dataSource;
//	}
	
	
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//		factoryBean.setDataSource(dataSource());
//		factoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/**/*Mapper.xml"));
//
//		/* Mapper.xml에서 ParameterType과 ResultType에 풀 패키지 Path를 포함해야 한다. 해당 메서드에 aliasPackage 명을 주어 생략이 가능하다. 현재는 mapper.xml 쪽에 풀 패키지 경로를 추가해준 상태 */
////		factoryBean.setTypeAliasesPackage("com.board.domain");
//		
//		factoryBean.setConfiguration(mybatisConfg());
//		return factoryBean.getObject();
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSession() throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory());
//	}

	
	/*application.properties에서 mybatis.configuration으로 시작하는 모든 설정을 읽어 들여 빈(Bean)으로 등록	 */
	@Bean
	@ConfigurationProperties(prefix = "mybatis.configuration")	
	public org.apache.ibatis.session.Configuration mybatisConfg() {
		return new org.apache.ibatis.session.Configuration();
	}
	
	
	
	
	
	
}