package com.supriya.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.supriya.dao.UserDataAccessImpl;
import com.supriya.service.UserDataServiceImpl;

@Configuration
@ComponentScan("com.supriya")
public class AppConfig {
	

	

}
