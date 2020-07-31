package com.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ImportResource("classpath:biz-service.xml")
public class JdbcTemplateConfiguration {
	@Bean("jdbcTemplate")
	public JdbcTemplate createTemplate(@Autowired DataSource dataSource){
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
}
