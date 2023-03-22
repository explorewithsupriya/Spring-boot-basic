package com.supriya.service;

import org.springframework.stereotype.Component;

import com.supriya.model.UserDetails;

@Component
public interface DataService {

	
	public UserDetails addData(UserDetails userDetails);
	public UserDetails updateData(UserDetails userDetails);
	public UserDetails findData(UserDetails userDetails);
	public UserDetails findAllData(UserDetails userDetails);
	
}
