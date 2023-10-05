package com.nissan.service;


import com.nissan.common.APIResponse;
import com.nissan.entity.User;
public interface IUserService {
	//add user
	public User saveUser(User user);
	
	//verify login
	public APIResponse loginByIdAndPassword(int loginId, String password);
	
}
