package com.supriya.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.supriya.dao.UserDataAccessImpl;
import com.supriya.model.UserDetails;


public class UserDataServiceImpl implements DataService {

	@Autowired
	UserDataAccessImpl userDataAccessImpl;

	@Override
	public UserDetails addData(UserDetails userDetails) {
		return userDataAccessImpl.addData(userDetails);
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
