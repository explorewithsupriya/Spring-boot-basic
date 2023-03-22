package com.supriya.dao;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.supriya.model.UserDetails;

@Component
public interface DataAccess {

	public void setDataSource(DataSource dataSource);
	public UserDetails addData(UserDetails userDetails);
	public UserDetails updateData(UserDetails userDetails);
	public UserDetails findData(UserDetails userDetails);
	public UserDetails findAllData(UserDetails userDetails);
	
}
