package com.supriya.test.handler;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.supriya.dao.UserDataAccessImpl;
import com.supriya.service.UserDataServiceImpl;

@Configuration
public class AppRequestRegistry implements WebMvcConfigurer{
	
	@Autowired
	AppRequestHandler appRequestHandler;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(appRequestHandler);
	}
	
	
	@Bean
	public UserDataServiceImpl userDataServiceImpl() {
		return new UserDataServiceImpl();
	}
	
	@Bean
	public UserDataAccessImpl userDataAccessImpl() {
		return new UserDataAccessImpl();
	}  
	
	@Bean
	public DataSource myPostgresDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://13.126.128.97:5432/postgres");
//		jdbc:postgresql://localhost:5432/shopme
		dataSource.setUsername("postgres");
		dataSource.setPassword("Mypostgre#1");

		return dataSource;
	}

}
