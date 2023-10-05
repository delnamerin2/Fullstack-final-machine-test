package com.nissan.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.APIResponse;
import com.nissan.entity.User;
import com.nissan.repository.IUserRepository;
import com.nissan.util.JwtUtil;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
		
	@Autowired
	private JwtUtil jwtutil;

	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private APIResponse apiResponse;
	
	
	@Override
	public APIResponse loginByIdAndPassword(int loginId, String password) {
		//verify user exist or not
		User user = userRepository.loginByLoginIdAndPassword(loginId, password);
		
		if(user==null) {
			apiResponse.setData("INVALID CREDENTIALS");
			return apiResponse;
		}
		
		//credentials are correct then
		String token = jwtutil.generateJwt(user);
		
		//storing more details and tokens
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("ACCESS TOKEN", token);
		data.put("role", user.getRoleId());
		data.put("LoginId",user.getLoginId());
		
		apiResponse.setStatus(200);
		apiResponse.setData(data);
		
		return apiResponse;
		
	}
	

	//save users
	@Override
	public User saveUser(User user) {
//		if(validation.isIdValid(user.getUserName())) {
//			return userRepository.save(user);
//		}
//		return null;
		return userRepository.save(user);
	}

}
