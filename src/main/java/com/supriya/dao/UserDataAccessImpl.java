package com.supriya.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.supriya.model.UserDetails;


public class UserDataAccessImpl  implements DataAccess {

	@Autowired
	JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	DataSource myPostgresDataSource;
	
	@Override
	public UserDetails addData(UserDetails userDetails) {
		UserDetails userDetails2 = new UserDetails();
		try {
		int row = jdbcTemplateObject.update("INSERT INTO user_details (	user_mob, user_name, user_age) VALUES ('"+userDetails.getUserMob()+"', '"+userDetails.getUserName()+"',"+Integer.parseInt(userDetails.getUseAge())+")");
		if(row>0) {
			userDetails2= userDetails;
			userDetails2.setStatus("Successful");
			
		}else {
			userDetails2.setStatus("Fail");
			userDetails2.setErrorMsg("No data added");
		}
		}catch(Exception e ) 
		{
			userDetails2.setStatus("Fail");
			userDetails2.setErrorMsg(e.getMessage());
			
		}
		
		return userDetails2;
		
	
	}
	@Override
	public void setDataSource(DataSource dataSource) {
		
		this.jdbcTemplateObject = new JdbcTemplate(myPostgresDataSource);
		
	}
	@Override
	public UserDetails updateData(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserDetails findData(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserDetails findAllData(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
